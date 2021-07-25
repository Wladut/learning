package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;                    // Statement is entire line;
        myVariable++;                           //Complete Statement
        myVariable--;                           //Complete Statement
        System.out.println("This is a test");   //Complete Statement            it is a method called and it has ; at the end

        System.out.println("This is " +                         //Complete Statement for all 3 lines => Java knows that the text was not enough for one line.
                "another" +
                " still more.");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one!");        // it is working but not indicated; better to declare variables on different lines
        // WhiteSpace is the space between int "here" my Variable;

        int Eugen
                =


                30;
        // Java is deleting spaces (White space) and the declaration is totally fine for it.


        // Indentation => indenting code to make it more readable;

        if (myVariable == 50) {
            System.out.println("Printed");               // Indenting for making it readable.

            // Reformat code => in Code if indent is not respected.
        }
    }
}