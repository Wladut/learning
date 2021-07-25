package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 14-09-11:55 PM
 * Time 11:55 PM
 */

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyTypes() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        }
        return false;
    }
}
