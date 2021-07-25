package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
    //integer has a width of 32
    //byte has a width of 8
    //short has a width of 16
    //long has a width of 64
        //datatypes which deal with whole numbers
    int myValue = 10000;             ///-2.147 bilion and 2.147 bilion number
    int myMinValue = -2_147_483_643;
    int myMaxValue = 2_147_483_647;
    int myTotal = (myMinValue/2);
        System.out.println(myTotal);
    byte myByteValue = -128;   // one bite-128 and 127 value (assign value of 10 to byte)
    byte myNewByteValue = (byte)(myByteValue/2);   /// putting (byte) in front is called casting
        System.out.println(myNewByteValue);
    short myShortValue = 32767;   //different type short is twice of data space than an byte is. and half of integer
    short myNewValue = (short)(myShortValue/2);
        long myLongValue = 100L;

        ///exercise:
        int a = 10;
        byte c = 30;
        short d = 45;
        long e = 50000L + 10L*(a+c+d);
        short g= (short) (1000+10*(a+c+d));
        System.out.println(g);
        System.out.println(e);
    }
}
