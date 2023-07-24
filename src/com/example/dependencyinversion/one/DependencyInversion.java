package com.example.dependencyinversion.one;

//Dependency inversion - High level modules should not directly depend on low level modules,
//instead they should depend on abstractions.
//also abstractions should not depend upon details, Details should depend upon abstractions.

//Application layer - High level module
class MyMessenger{
    ProtocolHandler handler;

    MyMessenger(String protocol){
        handler=ProtocolHandlerFactory.getProtocolHandler(protocol);
    }
    public void send(String client, String message){
        handler.sendMessage("message to - "+ client+", message "+message);
    }
}

interface ProtocolHandler{
    void sendMessage(String message);
}

//Transport layer - Low level module
class TCPHandler implements ProtocolHandler{
    public void sendMessage(String msg){
        System.out.println("TCPHandler sending message: "+msg);
    }
}

class UDPHandler implements ProtocolHandler{
    public void sendMessage(String msg){
        System.out.println("TCPHandler sending message: "+msg);
    }
}

class  ProtocolHandlerFactory{
    public static ProtocolHandler getProtocolHandler(String protocol){
        if ("TCP".equalsIgnoreCase(protocol)){
            return new TCPHandler();
        }else if ("UDP".equalsIgnoreCase(protocol)){
            return new UDPHandler();
        }
        return null;
    }
}
public class DependencyInversion {
    public static void main(String[] args) {
        MyMessenger messenger = new MyMessenger("TCP");
        messenger.send("Amit", "How are you");
    }
}
