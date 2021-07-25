package com.vladutvrinceanu;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
// for numbers with . double is faster and should be used instead of float; double is more precised
    public static void main(String[] args) {
        // integer width is 32 bits (4 bytes)
	int myIntValue = 5/2;
	// float width is 32 bits ( 4 bytes)
	float myFloatValue = 5f / 3f;   /// float has 7 numbers after .
        System.out.println(myFloatValue);
        // double width is 64 bits (8 bytes)
	double myDoubleValue = 5d / 3d;  // double has 16 numbers after .

        while(true) {

            if(scanner.nextLine()!="true"){
                System.out.println((scanner.nextLine()));
            System.out.println(myDoubleValue);
            System.out.println("My int value = " + myIntValue);
            System.out.println("My float value = " + myFloatValue);
            System.out.println("My double value = " + myDoubleValue);

            //Exercise: pounds to kilograms:
            double pound = 0.45359237d;
            int myPoundValue = 73;
            double myPoundResult = (double) myPoundValue * pound;
            System.out.println(myPoundValue + " pounds means " + myPoundResult + " kilograms");

            //His solution:
            double numPounds = 200d;
            double PoundsToKilograms = numPounds * 0.45359237d;
            System.out.println("Pounds " + numPounds + " means " + PoundsToKilograms + " kilograms.");
            double pi = 3.141_592_7d; // underscore can be used to make the number readable and no error will be shown
            //Remember primitive data types width:
            // int 32
            // long 64
            // short 16
            // byte 8
            //float 32
            //double 64
        }    }
}}
