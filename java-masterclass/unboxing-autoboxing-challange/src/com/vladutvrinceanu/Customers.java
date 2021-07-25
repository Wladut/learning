package com.vladutvrinceanu;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
