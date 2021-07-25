package com.vrinceanuvladut;

public class Main {

    public static void main(String[] args) {
//	    SomeClass one = new SomeClass("one");
//	    SomeClass two = new SomeClass("two");
//	    SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//    //    one.instanceNumber = 4;  //final number nu poate fi schimbat
//
//        System.out.println(Math.PI);
//
// //       Math m = new Math(); nu poate fi instantiat deoarece e public static final class
//
//        int pw = 674312;
//
//        Password password = new ExtendedPasword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);
//

        // Static block initializer

        System.out.println(" Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

        System.out.println("=============");
        SIBTest test2 = new SIBTest();
    }
}
