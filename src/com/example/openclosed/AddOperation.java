package com.example.openclosed;

//Open closed principle - Open for extension, closed for modification.
public class AddOperation implements Operation{
    @Override
    public int perform(int num1, int num2) {
        return num1+num2;
    }
}
