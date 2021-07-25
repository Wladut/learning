package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {

        Volkswagen myVolkswagen = new Volkswagen();
        Bmw myBmw = new Bmw();
        Audi myAudi = new Audi();

        myVolkswagen.startEngine();
        System.out.println(myVolkswagen.getWheels());

    }
}

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


     Car(String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;

        this.engine = true;
        this.wheels = 4;
    }


    public String getName() {
        return this.name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Engine was started.");
    }

    public void accelerate(){
        System.out.println("Car accelerated.");
    }

    public void brake(){
        System.out.println("Car brake.");
    }
}

class Volkswagen extends Car{

    private String name;
    private int cylinders;

    public Volkswagen(){
        super("Volkswagen", 2);
    }

    @Override
    public void startEngine() {
        System.out.println("Volkswagen engine was started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Volkswagen was accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen brakes.");
    }
}

class Bmw extends Car{

    private String name;
    private int cylinders;

    public Bmw(){
        super("Bmw", 2);
    }

    @Override
    public void startEngine() {
        System.out.println("Bmw engine was started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bmw was accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Bmw brakes.");
    }
}

class Audi extends Car{

    private String name;
    private int cylinders;

    public Audi(){
        super("Audi", 2);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi engine was started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi was accelerated.");
    }

    @Override
    public void brake() {
        System.out.println("Audi brakes.");
    }
}