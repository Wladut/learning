package com.vrinceanuvladut;

/**
 * Created by Vrinceanu Vladut on 16-09-9:50 AM
 * Time 9:50 AM
 */

public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.DWARF_PLANET);
    }
}
