package com.vladutvrinceanu;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }

        contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contacts contact){
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.contactList.size(); i++ ){
            Contacts contact = this.contactList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeContact(String contactName){
        int positionForRemoval = findContact(contactName);
        if (positionForRemoval ==  -1){
            System.out.println("Specified contact is not present in contact list.");
            return false;
        }
        this.contactList.remove(positionForRemoval);
        System.out.println(contactName + " was removed from contact list.");
        return true;
    }

    public void printContact(){
        for(int i = 0; i < this.contactList.size(); i++){
            Contacts contact = this.contactList.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " - " + contact.getPhoneNumber());
        }
    }

    public Contacts searchContact(String contactName){
        if(findContact(contactName) != -1){
            System.out.println(contactName + " is present in contact list.");
            return this.contactList.get(findContact(contactName));
        }
        else{
            System.out.println(contactName + " is not present in contact list.");
            return Contacts.createContact("No name", "No number");
        }
    }
}
