package com.example.interfacesegregation;

//InterfaceSegregation principle - a client/class should never be forced to implement an
// interface that it does not use.

interface VegRestaurant{
    void vegMeals();
}

interface NonVegRestaurant{
    void nonVegMeals();
}

class ABVegRestaurant implements VegRestaurant{
    @Override
    public void vegMeals() {
        System.out.println("We provide veg meals");
    }
}

class XYZRestaurant implements VegRestaurant, NonVegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("We provide veg meals");
    }

    @Override
    public void nonVegMeals() {
        System.out.println("We provide non-veg meals");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {

    }
}
