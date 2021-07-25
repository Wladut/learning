package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 30-08-2020
 * Time 10:57 PM
 */

public class SomeClass {
    //private final int instanceNumber = 1;   // if is = 1 here then can't be modified after.

    private static int  classCounter = 0;
    public final int  instanceNumber;
    private final String  name;

    public SomeClass(String name) {
        this.name = name;
  //      instanceNumber = 1;         // can be changed because was marked as final before constructor

        // cel mai  bine ca o variabila sa fie finala ar trebui sa fie declarata in construcotr.
        // la instanta sa ia o valoare dintr-o baza de date spre ex.

        classCounter++;
        instanceNumber = classCounter;

        System.out.println(name + " created, instance is " +  instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
