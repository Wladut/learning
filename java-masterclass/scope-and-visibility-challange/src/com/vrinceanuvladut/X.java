package com.vrinceanuvladut;

import java.util.Scanner;

/**
 * Created by Vrinceanu Vladut on 27-08-2020
 */
public class X {
    private int x;

    public X(Scanner x){
        System.out.println("Introdu un numar: ");
        this.x = x.nextInt();
    }

    public void x(){        // if I used parameter x then I had an error
        // can't use parameter x because is used in for loop
        for(int x = 1; x<13; x++){
            System.out.println(x + " times " + this.x + " equal " + x*this.x);
        }
    }

}
