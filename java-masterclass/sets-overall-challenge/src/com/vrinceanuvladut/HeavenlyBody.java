package com.vrinceanuvladut;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vrinceanu Vladut on 10-09-2020
 * Time 12:38 AM
 */

public abstract class HeavenlyBody {
    private final Key key;
//    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;           // field-ul este de tipul BodyTypes, adica enum


    // enum pentru bodyType, doar valorile de mai jos sunt acceptate
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {   // bodyType este initializat in constructor
       // this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
      //  this.bodyType = bodyType;
        this.key = new Key(name, bodyType);
    }



 /*   public String getName() {
        return name;
    }*/

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    /*
    public BodyTypes getBodyType() {
        return bodyType;
    } */

    public Key getKey(){
        return this.key;
    }

    public boolean addSatellite(HeavenlyBody moon) {    // to restrict PLANET class to add only moons we will override this in the PLANET class
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {               // modify the method to check for instanceof
        // make method final
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
//            if (this.name.equals(theObject.getName())) {            // daca au acelasi nume
//                return this.bodyType == theObject.getBodyType();  // returneaza rezultatul comparatiei dintre bodyType (eg.
//                // PLANET == PLANET => true sunt egale, altfel PLANET == MOON -> false)
//            }
            /**
             * to not have duplicated code, use the equals comparision from Key
             */
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {                                               // make method final
        //return this.name.hashCode() + 57 + this.bodyType.hashCode();            // add also hashCode from bodyType
        /**
         * Use hashCode from Key inner class
         */
        return this.key.hashCode();
    }

    @Override
    public String toString() {                                                      //printOut to easy see HeavenlyBody fields.
        return this.key.name + ": " + this.key.bodyTypes + ", " + this.orbitalPeriod;
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes){
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if(this.name.equals(key.getName())){
                return(this.bodyTypes == key.getBodyTypes());
            }
            return false;

        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}


