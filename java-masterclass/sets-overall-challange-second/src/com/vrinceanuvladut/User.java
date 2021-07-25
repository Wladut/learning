package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 15-09-8:03 AM
 * Time 8:03 AM
 */

public final class User<T extends Persoana> {
    private final int age;
    private final Persoana person;

    public User(String firstName, String secondName, int age) {
        if(secondName.charAt(secondName.length()-1) == 'a'){
            this.person = new Femeie(firstName, secondName);
        } else {
            this.person = new Barbat(firstName, secondName);
        }
        System.out.println("Esti " + person.getType() + ".");
        if(age<1994){
            try{
              Throwable e = new Throwable();
                throw new Exception("You are too young, age  is not initialized", e);}
                catch (Exception e){
                    System.out.println("Age set to FF");
                    this.age = 255;
                }
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return person.getFirstName();
    }

    public String getSecondName() {
        return person.getSecondName();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return person.getFirstName() + ", " + person.getSecondName();
    }

    @Override
    public int hashCode() {
        return person.getFirstName().hashCode() + 57;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return false;
        }
        User tempO = (User) o;
        if(o instanceof User){
            return person.getFirstName().equals(tempO.getFirstName());
        }
        return false;
    }
}
