package com.vladutvrinceanu;
import java.util.ArrayList;

class ddouble{
    private double ddoub;

    public ddouble(double ddoub) {
        this.ddoub = ddoub;
    }

    public void setDdoub(double ddoub) {
        this.ddoub = ddoub;
    }

    public double getDdoub() {
        return ddoub;
    }
}

public class Customer {
    private static String name;
    private static ArrayList<ddouble> transactions;
    private static int transactionNumber;

    public Customer(String name, int transactionNumber) {
        this.name = name;
        this.transactionNumber = transactionNumber;
    }

    public static String getName() {
        return name;
    }

    public static int getTransactionNumber() {
        return transactionNumber;
    }

    public static void setName(String name) {
        Customer.name = name;
    }

    public static void setTransactions(ArrayList<ddouble> transactions) {
        Customer.transactions = transactions;
    }

    public static void setTransactionNumber(int transactionNumber) {
        Customer.transactionNumber = transactionNumber;
    }

    public static ArrayList<ddouble> getTransactions() {
        return transactions;
    }

    public static Customer createCostumer(String name, int transactionNumber){
        return new Customer(name, transactionNumber);
    }

    public static void doTransaction(double money){
        ddouble myDouble = new ddouble(money);
        transactions.add(myDouble);
        System.out.println("Transaction updated, money = " + myDouble.getDdoub());
        transactionNumber -= transactionNumber - 1;

    }
}
