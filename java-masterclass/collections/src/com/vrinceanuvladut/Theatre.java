package com.vrinceanuvladut;

import java.util.*;

/**
 * Created by Vrinceanu Vladut on 02-09-2020
 * Time 11:26 PM
 */

public class Theatre{
    private  final String theatreName;
    //usually is private, but  changed for testing reversed sort method of Collection
    public List<Seat> seats = new ArrayList<>();          // We can use LinkedList  or ArrayList code will still work

    //or we can change List to Collection to be more generic

    // or can be new HashSet

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){

        // binarySearch method from java source code ( we don't have access )

        int low = 0;
        int high = seats.size()-1;

        while(low <= high){
            System.out.print(".");
            int mid = (low + high)/2;
            Seat midVal = seats.get(mid);
            int  cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmp < 0){
                low = mid + 1;
            } else if (cmp > 0){
                high = mid -1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;


        //Seat requestedSeat = null;

        // pentru a imbunatati cautarea
//        Seat requestedSeat = new Seat(seatNumber);
//        // ca sa mearga Collections.binarySearch trebuie sa schimbam declararea lui seats ca fiind List<Seat>
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//
//        if(foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }

//        for(Seat seat : seats){
//            System.out.print("."); // vedem cate locuri sunt de verificat pana sa ajunga la
//            // locul cerut
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }    // binarySearch method from java source code ( we don't have access )

//        if(requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;    // binarySearch method from java source code ( we don't have access )

//        }
//        return requestedSeat.reserve();
    }


    //for testing
    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }
    //usually is private, but  changed for testing reversed sort method of Collection
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean  reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public  boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation  of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return  false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }
    }
}
