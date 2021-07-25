package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 15-09-8:44 AM
 * Time 8:44 AM
 */

public final class Femeie extends Persoana{
    public Femeie(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String getType() {
        return "Femeie";
    }
}
