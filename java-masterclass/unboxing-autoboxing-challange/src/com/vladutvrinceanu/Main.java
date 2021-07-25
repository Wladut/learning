package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Transilvania");
        if(!bank.addBranch("Branch1")){
            System.out.println("Branch already exists.");
        }

        if(!bank.addCustomer("Branch1", "Vladut", 50.01)){
            System.out.println("Customer already exists");
        }

        bank.customersList("Branch1", true);

        bank.addTransaction("Branch1", "Vladut", 70.53);
        bank.customersList("Branch1", true);

        if(!bank.addBranch("Branch2")){
            System.out.println("Branch already exists.");
        }

        if(!bank.addBranch("Branch2")){
            System.out.println("Branch already exists.");
        }

        if(!bank.addCustomer("Branch2", "Vasile", 50.01)){
            System.out.println("Customer already exists");
        }

        if(!bank.addCustomer("Branch2", "Gheorghe", 50.01)){
            System.out.println("Customer already exists");
        }

        bank.addTransaction("Branch2", "Vasile", 70.53);
        bank.addTransaction("Branch2", "Vasile", 70.53);
        bank.addTransaction("Branch2", "Vasile", 70.53);

        bank.customersList("Branch2", true);

    }
}
