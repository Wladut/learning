package com.vrinceanuvladut;

import java.util.*;

/**
 * Created by Vrinceanu Vladut on 15-09-8:00 AM
 * Time 8:00 AM
 */

public class MainTest {

    private static Map<User, Integer> myMap = new HashMap<>();

    public static void main(String[] args) {
        User<Femeie> tempUser1 = new User("Vrinceanu", "Ruandra", 1994);
        myMap.put(tempUser1, tempUser1.getAge());

        User<Barbat> tempUser2 = new User("Vrinceanu", "Vladut", 1995);
        myMap.put(tempUser2, tempUser2.getAge());

        System.out.println(tempUser1.equals(tempUser2));
        System.out.println(tempUser2.equals(tempUser1));

        for(User user: myMap.keySet()){
            System.out.println(user + ", age: " + myMap.get(user));
        }

        LinkedList<String> myLinkedList = new LinkedList<>();
        String newString = "Ruxandra il iubeste foarte mult pe Vladut";
        String[]  parsedNewString = newString.split(" ");
        for(String s: parsedNewString){
            myLinkedList.add(s);
        }

        Iterator iterator = myLinkedList.listIterator();
        while (iterator.hasNext()){
            String tempString = (String) iterator.next();
            System.out.println(tempString + " hashCode: " + tempString.hashCode());
        }

    }

}
