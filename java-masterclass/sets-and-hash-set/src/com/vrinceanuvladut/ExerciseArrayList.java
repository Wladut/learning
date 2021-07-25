package com.vrinceanuvladut;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vrinceanu Vladut on 09-09-2020
 * Time 9:49 PM
 */

public class ExerciseArrayList {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        for(int i =  0; i<= 20;  i++){
            myArrayList.add(Integer.toString(i));
        }

        for(String  i   : myArrayList){
            System.out.print(i + " ");
        }

        System.out.println("===========");

        Iterator iterator = myArrayList.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("=============");
        try{
        for(int i = 0; i<= myArrayList.size();i++){
            System.out.print(myArrayList.get(i) + " ");
        }} catch (Exception e){
            System.out.println(e);                      //  error out of bounds
        }

    }
}
