package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;   // = -> operator, + -> operator
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println("previousResult  -1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        result = result/5;
        System.out.println(previousResult + " / 5 =" + result);

        previousResult = result;
        result = result % 3;   //catul impartirii la 3
        System.out.println(result);

        previousResult = result;
        result = result + 1;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;   /// equivalent with result = result + 2
        System.out.println(result);

        result *=10;
        System.out.println(result);

        result -=10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);


        boolean isAlien = true;
        if(isAlien == false){                           //// content of isAlien is equal with false then do something
            System.out.println("This is not an alien");}

        // != ; == ; >= ; > ; < ; <=
        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
            }



        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println(" Greather than top score and less then 100");

        if((topScore>90) || (secondTopScore<=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true: false;                 // boolean-ul wasCar va lua valoarea true sau false in functie de isCar true sau false; daca isCar e true atuci wasCar = true altfel false;
        if(wasCar)
            System.out.println("wasCar is true");
        //Exercise:
        // My solution:
        double newDouble = 20;
        double newSecondDouble = 80;
        double totalDouble = (newDouble + newSecondDouble) * 25;
        System.out.println(totalDouble);
        double reminderDouble = totalDouble % 40;                          // restul
        System.out.println(reminderDouble);
        if(reminderDouble<=20){
            System.out.println("Total was over the limit");

            int a = 1>2? 1:0;
            System.out.println(a);
        }


        }
    }
