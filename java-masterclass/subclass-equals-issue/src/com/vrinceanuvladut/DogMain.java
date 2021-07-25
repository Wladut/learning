package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 12-09-2020
 * Time 2:11 PM
 */

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

        //Labrador is an instance of Dog, but Dog isn't an instance of Labrador
        //Solution: Do not override equals method from Dog class
    }
}
