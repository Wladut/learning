package com.vrinceanuvladut;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // doar pentru exmplul scope and visibility nu este un bun exemplu practic
        // utilizarea aceluiasi nume de variabila este un exemplu rau in practica
        // aduce confuzie

        //My try:

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu numarul: ");
//        menu();
//        int close = 0;
//        int x = scanner.nextInt();
//        while (x != 2) {
//            switch (x) {
//                case 1:
//                    X newX = new X(scanner.nextInt());
//                    newX.x();
//                    x = scanner.nextInt();
//                    break;
//                case 2:
//                    break;
//
//                default:
//                    x = scanner.nextInt();
//                    break;
//            }
//
//        }

        //Tim:

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        X x = new X(scanner.nextInt());
//        x.x();

        // Second case with constructor that contains scanner as a parameter:

            X x = new X(new Scanner(System.in));
            x.x();

    }

    //My try

//    public static void menu(){
//        System.out.println("1 - De cate ori se va  afisa suita 1...12");
//        System.out.println("2 - Iesire");
//    }
}
