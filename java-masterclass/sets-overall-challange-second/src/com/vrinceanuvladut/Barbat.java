package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 15-09-8:44 AM
 * Time 8:44 AM
 */

public final class Barbat extends Persoana{
    public Barbat(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String getType() {
        return "Barbat";
    }
}
