package com.example.singleresponsibility;

//Single Responsibility principle - only one responsibility for a class.


class AccountService{
    AccountRepository repository=new AccountRepository();
    Notification notification = new Notification();
    public void openAccount(){
        //1
        System.out.println("fill account internal details");

        repository.create();

        notification.sendNotification();

        //responsibilities are segregated across the classes.
    }
}

class AccountRepository{
    public void create(){
        //2
        System.out.println("store object in the database");
    }
}

class Notification{
    public void sendNotification(){
        //3
        System.out.println("send out welcome message");
    }
}

public class SolidEx1 {
    public static void main(String[] args) {
        AccountService service=new AccountService();
        service.openAccount();
    }
}
