package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 30-08-2020
 * Time 2:15 AM
 */

public class ImplementAccessible implements Accessible {
    @Override
    public void methodA() {
        System.out.println(this.SOME_CONSTANT);
    }

    @Override
    public void methodB() {

    }

    @Override
    public boolean methodC() {
        return false;
    }
}
