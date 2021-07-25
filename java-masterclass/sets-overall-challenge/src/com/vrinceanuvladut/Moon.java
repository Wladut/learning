package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 13-09-7:21 PM
 * Time 7:21 PM
 */

public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
