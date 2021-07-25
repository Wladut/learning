package com.vladutvrinceanu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    //psvm and tab for creating main method
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOredr(placesToVisit, "Sydney");
        addInOredr(placesToVisit, "Melbourne");
        addInOredr(placesToVisit, "Brisbane");
        addInOredr(placesToVisit, "Perth");
        addInOredr(placesToVisit, "Canberra");
        addInOredr(placesToVisit, "Adelaide");
        addInOredr(placesToVisit, "Darwin");
        addInOredr(placesToVisit, "Alice Springs");
        addInOredr(placesToVisit, "Darwin");



        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);

    }



    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOredr(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        // for list itereator you need to use .next() to point to the first item
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
                // equall, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison>0){
                // new City should appear before this  one
                // Brisbane -> Adelaide return number grater than - because Adelaide is before Brisbane;
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0){
                //move on the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        boolean goingForward = true;
        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                    System.out.println("Now visiting " + listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting  " + listIterator.previous());
                    } else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to pvious city\n" +
                "3 - print menu options");
    }
}
