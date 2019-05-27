package com.danielberryman;

public class Main {

    public static void main(String[] args) {
        // width is 32
        int myIntValue = 5 / 3;
        // width of 32
        float myFloatValue = 5f / 3f;
        // width of 64
        double myDoubleValue = 5d / 3d;

//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("myFloatValue = " + myFloatValue);
//        System.out.println("myDoubleValue = " + myDoubleValue);

        // why use doubles if they're larger?
        // doubles is actually faster on modern computer
        // inbuilt functions in java use doubles
        // doubles are far more precise

        double numPounds = 200;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
