package com.vladutvrinceanu;

// Class Contacts, this is used for store name and phoneNumber

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber(){return phoneNumber;}

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
