package com.vladutvrinceanu;

import java.util.ArrayList;

public class Branches {
    private ArrayList<Customer> customer;
    private String branchName;

    public Branches(String branchName) {
        this.branchName = branchName;
    }

    public boolean addCustomer(Customer newCustomer){
            if(this.customer.contains(newCustomer)){
                System.out.println("Customer with name " + newCustomer.getName() + " already exists.");
                return false;
       }
            this.customer.add(newCustomer);
        System.out.println("Customer with name " + newCustomer.getName() + " with initial transactions amaount of " +
                newCustomer.getTransactions() + " was added.");

            return true;

    }

    public boolean addTransactions(Customer customer, int transactions){
        if(!this.customer.contains(customer)){
            System.out.println("Customer with name " + customer.getName() + " doesn't exists.");
            return false;
        }
        int trans = customer.getTransactionNumber();
        trans += transactions;
        customer.setTransactionNumber(trans);
        System.out.println("Transactions added, total number of transactions is " + trans);
        return true;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public static Branches createBranch(String branchName){
        return new Branches(branchName);
    }
}
