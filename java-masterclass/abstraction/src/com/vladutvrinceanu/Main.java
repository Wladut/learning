package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breath();
	    dog.eat();

//	    Bird bird = new Bird("Parrot");
//	    bird.breath();
//	    bird.eat();

        // you can't instantiate a class that is abstract

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();



    }
}
