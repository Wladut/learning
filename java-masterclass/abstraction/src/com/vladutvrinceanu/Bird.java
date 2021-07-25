package com.vladutvrinceanu;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, bread out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
