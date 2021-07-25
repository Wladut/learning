package com.vladutvrinceanu;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank myBank = new Bank("myBank");
    public static void main(String[] args) {
	    boolean quit = false;

        System.out.println("Press specific key for following actions: " );
        printInstructions();

        while(!quit){
            int selection = scanner.nextInt();

            switch(selection){
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    doTransaction();
                    break;
                case 4:
                    printCustomer();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 6:
                    printInstructions();
                    break;
                case 7:
                    quit  = true;
                    break;


            }
        }
    }

    public static void addBranch(){
        System.out.println("Enter branch name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branches newBranch = Branches.createBranch(branchName);
        myBank.addBranch(newBranch);
    }

    public static void addCustomer(){

    }

    public static void doTransaction(){

    }

    public static void printCustomer(){

    }

    public static void addTransaction(){

    }



    public static void printInstructions(){

        System.out.println("1 - add branch.");
        System.out.println("2 - add customer");
        System.out.println("3 - do transaction for specific customer, from specific branch.");
        System.out.println("4 - print customer from specific brench.");
        System.out.println("5 - add transactions");
        System.out.println("6 - print actions");
        System.out.println("7 - quit");
        System.out.println("Press key:");
    }
}
