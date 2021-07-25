package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // primitive data types:
        // byte
        // short
        // int
        // long
        // double
        // char
        // boolean

        // String is not a primitive data type, is a class;

        String myString = "This is a string";
        System.out.println(myString); // append with plus + operator
        myString = myString + ", and this is more."; ///just '' means one letter "" is for sequence.
        System.out.println(myString);
        myString = myString + " \u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

        // char to double
        double myDouble = Double.parseDouble(lastString);
        System.out.println(myDouble);
        String a = String.valueOf(myInt);
        System.out.println(a);
    }
}
