package com.vrinceanuvladut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vrinceanu Vladut on 12-09-2020
 * Time 3:44 PM
 */

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);  // initializez constructor-ul cu valorile din squares.
        union.addAll(cubes);  // bulk operations are destructive, modifica set-ul care  aplica metoda.
        System.out.println("Union contains " + union.size() + " elements.");

//        union = new HashSet<>(squares);
//        union.retainAll(cubes);
//        System.out.println("Union intersection contains " + union.size() + " elements.");
//
//        union = new HashSet<>(squares);
//        union.removeAll(cubes);
//        System.out.println("Union remove contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);                          // elements that are the same in the squares and cubes;
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        for(int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));  // Math.sqrt radical patrat, Math.cbrt radical cu radacina 3.
        }

        // removeAll bulk operation -> Asymmetric

        System.out.println("======");
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s: words){
            System.out.println(s);
        }



        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));


        System.out.println("->Asymmetric difference:");
        System.out.println("\nnature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        /**
         * Asymmetric difference
         */
        diff1.removeAll(divine);                        // removeAll - set-ul diff1 se  modifica -> in el raman  doar elementele care erau in diff1 si
                                                        // nu sunt in divine
        printSet(diff1);

        System.out.println("\ndivine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        /**
         * Asymmetric difference
         */
        diff2.removeAll(nature);                        // removeAll - set-ul diff2 se modifica -> in el raman  doar elementele care erau in diff2 si
                                                        // nu sunt in nature
        printSet(diff2);


        System.out.println("******************");
        /**
         * Symmetric difference Vladut solution:
         */
        /*

         */
        /*
        Set<String> unionNatureDivine = new HashSet<>(nature);
        unionNatureDivine.addAll(divine);
        Set<String> intersectionNatureDivine = new HashSet<>(nature);
        intersectionNatureDivine.retainAll(divine);
        Set<String> symmetricDifference = new HashSet<>(unionNatureDivine);
        symmetricDifference.removeAll(intersectionNatureDivine);
        printSet(symmetricDifference);
        */


        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("->Symmetric difference:");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)){
            System.out.println("Divine is subset of nature");
        }
        if(nature.containsAll(intersectionTest)){
            System.out.println("Intersection is subset of nature");
        }
        if(divine.containsAll(intersectionTest)){
            System.out.println("Intersection is a subset of divine");

            System.out.println("");
        }
    }

    private static void printSet(Set<String> set){
        System.out.println("============");
        for(String s: set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
