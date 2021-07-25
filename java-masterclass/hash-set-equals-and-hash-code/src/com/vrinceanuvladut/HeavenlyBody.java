package com.vrinceanuvladut;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Vrinceanu Vladut on 10-09-2020
 * Time 12:38 AM
 */

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // Solutia mea:
    // pentru equals() - returneaza equals dintre string this.name pentru obiectul actual si Object "o";
    // am facut cast sa specific ca obiectul "o" e de tipul HeavenlyBody; true daca e egal, altfel false;
    // in acest caz se utilizeaza equals de la string si nu acelasi equals din clasa curenta

    // Pentru hashCode():
    //  returnez suma ascii a caracterelor din this.name String;
    // astfel daca numele planetei este acelasi atunci si hashCode() va returna aceeasi valoare;

//    @Override
//    public boolean equals(Object o) {
//        HeavenlyBody body = (HeavenlyBody) o;
//        return this.name.toLowerCase().equals(body.getName().toLowerCase());
//    }
//
//    @Override
//    public int hashCode() {
//        int hashCodes =  0;
//        for(int i = 0; i<this.name.length(); i++){
//            hashCodes += (int) this.name.charAt(i);
//        }
//        return hashCodes;
//    }


//    // acestea pot fi generate automat
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HeavenlyBody body = (HeavenlyBody) o;
//        return Objects.equals(name, body.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }



    //Tim solution:

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
//        return this.name.hashCode();  // not good practice here
        //daca returnezi 0 pierzi performanta deoarece toate vor fi stocate in aceeasi locatie, si se pierde utilitatea hashcode-ului

        System.out.println("hashCode called");
       return this.name.hashCode() + 57; // adaugam 57(nu afecteaza int) la hashCode-ul returnat de string
    }


}
