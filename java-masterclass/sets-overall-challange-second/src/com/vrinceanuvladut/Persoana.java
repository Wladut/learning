package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 15-09-9:34 AM
 * Time 9:34 AM
 */

public abstract class Persoana {
    private final String firstName;
    private final String secondName;

    public Persoana(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public abstract String getType();
}
