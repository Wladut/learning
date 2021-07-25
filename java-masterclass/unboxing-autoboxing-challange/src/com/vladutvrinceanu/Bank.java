package com.vladutvrinceanu;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranches(branchName) != null){
            return false;
        }
        Branch branch = new Branch(branchName);
        branches.add(branch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranches(branchName);
        if(branch == null){
            return false;
        }
        if(branch.findCustomer(customerName) == null){
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranches(branchName);
        if(branch == null){
            return false;
        }
        if(branch.findCustomer(customerName) == null){
            return false;
        }
        branch.addTransaction(customerName, amount);
        return true;
    }

    public boolean customersList(String branchName, boolean listTransactions){
        Branch branch = findBranches(branchName);
        if(branch == null){
            return false;
        }
        ArrayList<Customers> customers = branch.getCustomers();
        for(int i = 0; i<customers.size();i++){
            Customers customer = customers.get(i);
            System.out.println("Customer " + (i+1) + " is : " + customer.getName());
            if(listTransactions){
                ArrayList<Double> transactions = customer.getTransactions();
                System.out.println("Transactions : ");
                for(int j = 0; j<transactions.size();j++){
                    System.out.println("[" + (j+1) + "] = " + transactions.get(j));
                }
            }
        }
        return true;

    }





    public Branch findBranches(String name){
        for(int i = 0 ; i<branches.size();i++){
            Branch branch = branches.get(i);
            if(branch.getName() == name){
                return branch;
            }
        }
        return null;
    }
}
