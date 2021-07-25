package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
	    //Interface is abstract

        //using interface for vladutPhone, I can change
        //vladutPhone to be an object of another class
        //if vladutPhone was declared as object of one class
        //and not  an interface type this wouldn't be possible

        ITelephone vladutPhone;
        vladutPhone = new DeskPhone(0747310610);

        vladutPhone.powerOn();
        vladutPhone.callPhone(0747310610);
        vladutPhone.answer();

        vladutPhone = new MobilePhone(12345);
        vladutPhone.powerOn();
        vladutPhone.callPhone(12345);
        vladutPhone.answer();



    }
}
