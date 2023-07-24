package com.example.liskov;

//Liskov substitution - objects of super class shall be replaced with objects of subclasses.

class Vehicle{
    public void start(){
        System.out.println("Starting a vehicle");
    }
    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Starting a bike");
    }
    public void stop(){
        System.out.println("Stopping a bike");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Starting a car");
    }
    public void stop(){
        System.out.println("Stopping a car");
    }
}
public class LiskovSubstitution {
    static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
