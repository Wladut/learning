package com.vladutvrinceanu;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    // abstract class inherit abstract methods

    //forcing class which inherit from this abstract class to use abstract methods

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
