package com.vladutvrinceanu;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone("0747310610");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        System.out.println("Phone is starting...");
        printOptions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0 :
                    addNewContact();
                    break;
                case 1:
                    updateContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    printContacts();
                    break;
                case 5:
                    printOptions();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Phone is shutting down...");
                    break;

            }


        }


    }

    public static void printOptions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To add new contact.");
        System.out.println("\t 1 - To update existing contact.");
        System.out.println("\t 2 - To remove contact.");
        System.out.println("\t 3 - To search contact.");
        System.out.println("\t 4 - To print list of contacts.");
        System.out.println("\t 5 - To print options.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addNewContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(contactName, phoneNumber);
        mobilePhone.addNewContact(newContact);
    }

    public static void updateContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contacts myContact = mobilePhone.searchContact(contactName);
        if (!(myContact.getName().equals("No name"))){
            System.out.println("Enter new contact name: ");
            String newContactName = scanner.nextLine();
            System.out.println("Enter new contact number: ");
            String newContactNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(newContactName, newContactNumber);
            mobilePhone.updateContact(myContact, newContact);
        }

    }

    public static void removeContact(){
        System.out.println("Enter contact name for removal: ");
        String contactName = scanner.nextLine();
        if(mobilePhone.removeContact(contactName)) {
            System.out.println(contactName + " was removed.");
        }
        else{
            System.out.println(contactName + " was not removed.");
        }
    }

    public static void searchContact(){
        System.out.println("Enter contact name: ");
        String contact = scanner.nextLine();
        mobilePhone.searchContact(contact);

    }

    public static void printContacts(){
        mobilePhone.printContact();
    }
}
