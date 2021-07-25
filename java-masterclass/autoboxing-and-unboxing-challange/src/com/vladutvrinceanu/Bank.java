package com.vladutvrinceanu;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches> branches = new ArrayList<Branches>();
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean addBranch(Branches breanches){
        if(branches.contains(breanches)){
            System.out.println("Branch " + breanches.getClass().getName() + " already exists.");
            return false;
        }
        branches.add(breanches);
        System.out.println("Branch " + breanches.getClass().getName() + " added.");
        return true;
    }

    public boolean addCustomer(Branches breanches,Customer newCustomer){
        if(!branches.contains(breanches)){
            System.out.println("Branch " + breanches.getClass().getName() + " do not exists.");
            return false;
        }
        breanches.addCustomer(newCustomer);
        return true;
    }

    public boolean doTransaction(Branches breanches, Customer customer,  double transaction){
        if(!branches.contains(breanches)){
            System.out.println("Branch " + breanches.getClass().getName() + " do not exists.");
            return false;
        }
        if(!breanches.getCustomer().contains(customer)){
            System.out.println("Costumer " + customer.getName() + " do not exists in branch " + breanches.getClass().getName());
            return false;
        }

        for(int i = 0;  i<breanches.getCustomer().size();i++){
            if(breanches.getCustomer().get(i) == customer){
                if(breanches.getCustomer().get(i).getTransactionNumber()>0){
                breanches.getCustomer().get(i).doTransaction(transaction); }
                else{
                    System.out.println("Transaction is not possible, number of transactions is 0.");
                }

            }
        }
        System.out.println("Transaction number updated.");
        return true;
    }

    public void printCustomers(Branches breanches){
        if(!branches.contains(breanches)){
            System.out.println("Branch " + breanches.getClass().getName() + " do not exists.");
        }
        int i = branches.indexOf(breanches);
        for(int j = 0; j<branches.get(i).getCustomer().size();i++){
            System.out.println("Customer 1: " + branches.get(i).getCustomer().get(j).getName() + " with transactions : " + branches.get(i).getCustomer().get(j).getTransactions().toString());
        }
    }

}
