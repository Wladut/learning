package com.vladutvrinceanu;

public interface ITelephone {

    //define methods

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
