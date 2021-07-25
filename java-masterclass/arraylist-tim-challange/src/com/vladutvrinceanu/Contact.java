package com.vladutvrinceanu;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    //method to create contact - calling the constructor, return contact record
    public static Contact createContanct(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
