package com.vrinceanuvladut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    int lastRow = 'A';
//        System.out.println(lastRow);  ascii A

 //       System.out.println(String.format("%02d", 20));

        //######################################

        Theatre theatre = new Theatre("Olympian", 8, 12);
        //theatre.getSeats();

        //with HashSets seats are  in a different order

//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        if(theatre.reserveSeat("B13")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }


    //    ########################################################

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); // shallow copy
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        // listele theatre.seats si seatCopy fac share la aceleasi obiecte, iar daca rezervam
        // un loc in una din liste atunci va fi rezervat si  in cealalta.
        // contin referinte  actre acelasi  obiect


     //   Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);              // o metoda de a face randomize pe o lista
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        // exercise by myself to try compareTo results

//        Theatre th1 = new Theatre("hmm", 1,1);
//        Theatre.Seat seat1 = th1.new Seat("A00");
//        System.out.println("---------------");
//        th1.getSeats();
//        th1.seats.add(seat1);
//        th1.getSeats();
//
//        System.out.println(th1.seats.get(0).compareTo(seat1));

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);


//        // playing with copy method from Collections, seems that objects are not copied
//        Collections.copy(seatCopy, theatre.seats);
//
//        if(seatCopy.get(3).reserve()){
//            System.out.println("Reserved A04 for seatCopy, please pay");
//        } else {
//            System.out.println("Already reserved A04 for seatCopy");
//        }
//
//        if(theatre.seats.get(3).reserve()){
//            System.out.println("Reserved A04 for theatre.seats, please pay");
//        } else {
//            System.out.println("Already reserved A04 for theatre.seats");
//        }




    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================");
    }


    public static void sortList(List<? extends Theatre.Seat> list){
        for(int i = 0; i<list.size() - 1; i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){  // compare method -> daca elem i e mai mare ca elem j fa swap
                    Collections.swap(list, i, j);         // variation of bubble sort method
                    // sortare de la mic la mare
                }
            }
        }
    }

}
