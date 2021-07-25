package com.vrinceanuvladut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vrinceanu Vladut on 06-09-2020
 * Time 8:26 PM
 */

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));


        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=============");


 //       languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

 //       System.out.println(languages.replace("Lisp","a functional programming language with imperative features"));

        if(languages.replace("Lisp","Therein lies madness","a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will  not be added"));


        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

//        System.out.println("===============");
//
//        Iterator<Map.Entry<String, String>> it = languages.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> pair = it.next();
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//
//        System.out.println("===============");
//        Iterator iterator = languages.keySet().iterator();
//        while(iterator.hasNext()){
//            Object pair = iterator.next();
//            System.out.println(pair + " : " + languages.get(pair));
//        }
//
    }
}
