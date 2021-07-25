package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 02-09-2020
 * Time 9:10 PM
 */

public class SIBTest {
    public static final String owner;

    // primul block ca prioritate la declararea instantei ( se face call doar o singura data)
    static {
        owner = "vladut";
        System.out.println("SIBTest static initialization block called");
    }

    //al 3-lea block ca prioritate la declararea instantei
    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    // al 2-lea block ca prioritate la declararea instantei ( se face call doar o singura data)
    static {
        System.out.println("2nd initializatin block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
