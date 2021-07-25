package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 21-10-8:51 AM
 * Time 8:51 AM
 */

public class Moon extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
