package com.example.openclosed;
//Open closed principle - Open for extension, closed for modification.

//This is a bad design where we are taking type and for
//each type we are having cases. Now if we want to introduce division,
//we need to modify this class

public class BadCalculator {
    public int calculateNumber(int num1, int num2, String type){
        int result=0;
        switch (type){
            case "add":
                result=num1+num2;
            case "sub":
                result=num1-num2;
        }
        return result;
    }
}
