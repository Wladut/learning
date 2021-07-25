package com.vrinceanuvladut;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseHashSet {

    public static void main(String[] args) {
        Set<String> newHashSet = new HashSet<>();

        for(int i = 0; i<=20; i++){
            if(i%2==0){
                newHashSet.add(Integer.toString(i));
            } else {
                newHashSet.add("Vladut + " + Integer.toString(i));
            }
        }

        Iterator iterator = newHashSet.iterator();
        while(iterator.hasNext()){
            Object setObj = iterator.next();
            System.out.println(setObj.toString());
        }

        System.out.println("=============");

        for(int i = 0; i<=newHashSet.size(); i++){
            System.out.println(newHashSet.contains("Vladut + 3"));
            //System.out.println(newHashSet.remove("Vladut + 3"));
        }

        System.out.println("=============");

        System.out.println("HashSetTwo:");
        
        Set<String> newHashSetTwo = new HashSet<>(newHashSet);
        System.out.println(newHashSetTwo.remove("Vladut + 3"));
        iterator = newHashSetTwo.iterator();
        while(iterator.hasNext()){
            Object setObj = iterator.next();
            System.out.println(setObj.toString());
        }

        System.out.println("=============");
        System.out.println("newHashSet:");
        iterator = newHashSet.iterator();
        while(iterator.hasNext()){
            Object setObj = iterator.next();
            System.out.println(setObj.toString());
        }

        newHashSetTwo = new HashSet<>();
        for(int i = 0; i<= 20; i++){
            newHashSetTwo.add(Integer.toString(1));
        }

        System.out.println("==========");
        System.out.println("Single elemment added in HashSet");
        iterator = newHashSetTwo.iterator();
        while(iterator.hasNext()){
            Object setObj = iterator.next();
            System.out.println(setObj.toString());
        }
    }
}
