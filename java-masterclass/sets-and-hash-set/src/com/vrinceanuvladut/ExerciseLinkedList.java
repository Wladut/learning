package com.vrinceanuvladut;

import java.util.*;

/**
 * Created by Vrinceanu Vladut on 09-09-2020
 * Time 9:42 PM
 */

public class ExerciseLinkedList {
    private static List<HashSet<String>> newLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        HashSet<String> newHashSet = new HashSet<>();
        newHashSet.add("Vlad");
        newHashSet.add("Ruxandra");
        newHashSet.add("Ioan");
        newHashSet.add("Vladut");
        newLinkedList.add(newHashSet);

        newHashSet = new HashSet<>();
        newHashSet.add("Vlad2");
        newHashSet.add("Ruxandra2");
        newHashSet.add("Ioan2");
        newHashSet.add("Vladut2");

        newLinkedList.add(newHashSet);

        Iterator iterator = newLinkedList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=================");

        for (int i  = 0; i<= newLinkedList.size()-1; i++){
            System.out.print(newLinkedList.get(i) + " ");
        }

        System.out.println("=================");


        try{
        for (int i  = 0; i<= newLinkedList.size(); i++){
            System.out.print(newLinkedList.get(i) + " ");   // eroare out of bounds
        }} catch (Exception e){
            System.out.println(e);
        }
    }
}
