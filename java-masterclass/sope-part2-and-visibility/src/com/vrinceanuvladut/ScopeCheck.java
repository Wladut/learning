package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 26-08-2020
 */
public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;  // nu conteaza ca e privat, este accesibil si in InnerClass e in acelasi scope;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar
                + ": varOne =" +
                varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for(int i = 0; i<10; i++){
            System.out.println(i + " times two is " + i*varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass{
        private int varThree = 3;  // poate fi public sau private, tot va fi valabil in outer class

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " varThree is " + varThree);
        }

        public void timesTwo(){
            System.out.println("varOne is still available here " + varOne);
            for(int i = 0; i<10; i++){
                System.out.println(i + " times two is " + i* varThree); // this.varOne pentru a specifica variabila privata
            }
        }



    }
}
