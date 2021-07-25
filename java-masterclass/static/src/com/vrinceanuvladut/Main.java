package com.vrinceanuvladut;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {            // pentru a rula un program Java main trebuie
//        //sa fie statica pentru a putea fi accesata fara instanta clasei.
//
//        System.out.println(StaticTest.getNumInstances());
//
//	    StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " +
//                StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " +
//                StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " +
//                StaticTest.getNumInstances());
//
//        //Integer.parseInt -> metoda statica din Integer class:
//
//        System.out.println(Integer.parseInt("3")+5);
//
//        // java com.company._static.Main (run program from console)

        // static methods nu pot accesa metode sau variabile non-statice

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int  number){
        return number*multiplier;
    }
}
