package com.vrinceanuvladut;

import sun.reflect.generics.scope.Scope;

/**
 * Created by Vrinceanu Vladut on 26-08-2020
 */
public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar
                + ": privateVar =" +
         privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;             // daca comentam linia asta va lua in considerare variabila privata
        for(int i = 0; i<10; i++){
            System.out.println(i + " times two is " + i*privateVar); // this.privateVar pentru a specifica variabila privata
        }

 //       System.out.println("Value of i is now " + i);
    }

    public void hy(){
        System.out.println("Hello!");
    }

    public class InnerClass{
        public int privateVar = 3;  // daca comentam foloseste privateVar din ScopeCheck

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo(){
            ScopeCheck.this.timesTwo(); // call method din ScopeCheck class.
  //          int privateVar = 2;             // daca comentam linia asta va lua in considerare variabila privata
            for(int i = 0; i<10; i++){
                System.out.println(i + " times two is " + i*ScopeCheck.this.privateVar); // this.privateVar pentru a specifica variabila privata

                //sau ScopeCheck.this.privateVar specifica exact privateVar din outer class ScopeCheck
            }
        }

    }
}
