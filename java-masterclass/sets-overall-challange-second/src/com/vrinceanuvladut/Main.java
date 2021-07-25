package com.vrinceanuvladut;

import java.util.*;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Mars;

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Mars;

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("IO", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Jupiter;

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Jupiter;

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Jupiter;

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); //temp is still Jupiter;

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
        }

        System.out.println("===============");

        HeavenlyBody body = solarSystem.get("MarsPLANET");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("===========");
        System.out.println("All moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new Planet("Pluto", 842);
        planets.add(pluto);
        solarSystem.put(pluto.getKey(), pluto);

        System.out.println("================");

        for(HeavenlyBody planet: planets){
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod() + ", type: " + planet.getBodyType());
        }

        System.out.println("==============");


        HeavenlyBody pluto2 = new DwarfPlanet("Pluto", 255);
        planets.add(pluto2);
        solarSystem.put(pluto2.getKey(), pluto2);

        for(HeavenlyBody planet: planets){
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod() + ", type: " + planet.getBodyType());
        }

        System.out.println(pluto.equals(pluto2));
        System.out.println(pluto2.equals(pluto));

        System.out.println(pluto.equals(pluto));

        System.out.println("========");

        for(HeavenlyBody heavenlyBody: solarSystem.values()){
            System.out.println(heavenlyBody.getName() + ": " + heavenlyBody.getOrbitalPeriod());
        }

    }
}
