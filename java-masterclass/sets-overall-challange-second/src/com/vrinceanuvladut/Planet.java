package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 16-09-9:49 AM
 * Time 9:49 AM
 */

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyType.MOON){
            return super.addSatellite(moon);
        }
        System.out.println("Only moons can be added to planets as satellite.");
        return false;
    }
}
