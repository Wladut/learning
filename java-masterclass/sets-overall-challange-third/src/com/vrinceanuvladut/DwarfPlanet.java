package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 21-10-8:50 AM
 * Time 8:50 AM
 */

public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
