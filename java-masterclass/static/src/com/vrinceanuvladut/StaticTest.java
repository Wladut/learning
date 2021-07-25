package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 30-08-2020
 * Time 9:23 PM
 */

public class StaticTest {
    private static int numInstances = 0;  // private int -> variable is associated with class, at every instance

    // cu static variabila este astociata clasei, fiind disponibila pentru toate instantele clasei.

    private String name;

    public static int getNumInstances() {
        return numInstances;
    }

    // daca o metoda este statica atunci ea poate fi accesata fara instanta clasei.

    public String getName() {
        return name;
    }

    public StaticTest(String name){
        this.name = name;
        numInstances++;
    }

}
