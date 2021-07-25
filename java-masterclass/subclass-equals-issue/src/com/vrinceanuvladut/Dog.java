package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 12-09-2020
 * Time 2:06 PM
 */

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object o) {
        if(this == o){
            return true;
        }

        if(o instanceof Dog){
            String objName = ((Dog) o).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
