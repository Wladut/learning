package com.vrinceanuvladut;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vrinceanu Vladut on 10-09-2020
 * Time 12:38 AM
 */

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;
    private final String key;

    enum BodyType{
        PLANET,
        MOON,
        START,
        DWARF_PLANET
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
        this.key = this.name + this.bodyType.toString();
    }

    public String getName() {
        return name;
    }

    public String getKey(){return key;}

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }
        BodyType objBodyType = ((HeavenlyBody) obj).getBodyType();
        return this.bodyType.equals(objBodyType);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    public BodyType getBodyType() {
        return bodyType;
    }
}
