package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	    // in Java is possible to nest a class inside another class
        // non-static inner class

 /*       Gearbox mcLaren = new Gearbox(6);
        //eg for inner class: (there will be an error if main class object is not created).
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);                                       (second eg. Gear is private)
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);          (here is an error as eg.)
//        Gearbox.Gear third = new mcLaren.Gear(3,17.8);            (here is another error as eg. to no declare)
//        System.out.println(first.driveSpeed(1000));               (was ok before, but now inner class is private)

        //usually inner classes are private so, the instance of the inner class is created by main class internally
        // in this case by Gearbox

//        mcLaren.addGear(1, 5.3);              // because add gear is removed
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));  */

        // clutch = ambreiaj

   //     first eg.:

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                //this is an anonimous class
                System.out.println(title +" was clicked");
            }
        });
        listen();

    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
