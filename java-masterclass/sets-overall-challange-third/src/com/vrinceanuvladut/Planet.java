package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 21-10-8:45 AM
 * Time 8:45 AM
 */

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
        return super.addSatellite(moon);}
        return false;
    }
}
