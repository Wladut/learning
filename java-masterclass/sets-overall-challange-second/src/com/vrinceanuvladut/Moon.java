package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 16-09-9:49 AM
 * Time 9:49 AM
 */

public class Moon extends HeavenlyBody{
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.MOON);
    }
}
