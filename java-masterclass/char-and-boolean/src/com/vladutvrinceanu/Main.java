package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'D';  // one letter/number and so on ( width of 16 bits (2 bytes) )
        int a = 0x70F7;
        char u = 'U';
        System.out.println((char)(u+a)); // failed to write caracter

        //His example for unicode:
        char myChar1 = '\u70F7';
        System.out.println(myChar1);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        //Exercise: hint wwww.unicode-table.com - list with ascii
        char myRegisterChar = '\u00ae';
        System.out.println(myRegisterChar);





    }
}
