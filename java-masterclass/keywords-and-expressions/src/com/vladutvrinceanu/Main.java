package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {

        //50 keywords for java
        // keywords are shown in blue
        int int2 = 5;
        //fals, true, null

        String a = "\u00a9E mai faci?!!!";

        System.out.println(a);

        // 1 mile = 1.609344
        double kilometers = (100 * 1.609344);   //this is an expression

        int highScore = 50;

        if(highScore ==50){                                     // What is in paranthesis is an expression

            System.out.println("This is an expression");   //what is in brackets is an expression
        }


        int score = 100;           // (score = 100) is the expression   int and ; are not part of expression

        if (score > 99){                                                // The code in {} is an expression       (score > 99) is an expression
            System.out.println("You got the high score");              // What is in brackets is an expression => "You got the high score"
            score = 0;                                                                                             //   (score = 0) is an expression
        }
    }
}
