package com.vladutvrinceanu;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customers>();
    }

    public boolean addCustomer(String customerName, double initialAmaount){
        if(findCustomer(customerName) != null){
            return false;
        }
        Customers customer = new Customers(customerName, initialAmaount);
        customers.add(customer);
        return true;
    }

    public boolean addTransaction(String customerName, double amount){
        Customers customer = findCustomer(customerName);
        if(customer == null){
            return false;
        }
        customer.addTransaction(amount);
        return true;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public Customers findCustomer(String name){
        for(int i = 0 ; i<customers.size();i++){
            Customers customer = customers.get(i);
            if(customer.getName() == name){
                return customer;
            }
        }
        return null;
    }
}
