package com.company;

import java.util.ArrayList;

public class Main {

    // daca specificam ca ArrayList este de tipul Integer atunci vom avea eroare
    // daca adaugam un String  in arraylist ( ne asiguram ca userul nu pune un element
    // gresit impunand ca arraylist sa fie de tipul Integer

    // cu ArrayList items  putem adauga "vladut" si eroarea este detectata doar la run
    // time

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();  // pot fi doar <> (versiunea 1.8) in loc de <Integer>
        items.add(1);
        items.add(2);
        items.add(3);
 //       items.add("vladut");
        items.add(4);
        items.add(5);

        printDoubled(items);


    }

    private static void printDoubled(ArrayList<Integer> items){
        for(int i: items){                                                  // in loc de Object i: items
            System.out.println("Element " + i + " doubled is : " + i * 2);  // cast pentru (Integer) nu mai este necesar
        }
    }
}
