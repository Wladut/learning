package com.company;

import java.util.ArrayList;
import java.util.Collections;

// league extinde Team generic <T extends Team>
// contine nume si arraylist pentru echipe
// are posibilitatea de a adauga echipe in liga (trebuie specficat ce fel de team e) eg. Team<footballTeam>
// echipa adaugata nu poate fi duplicata
// Obs: Daca lista este goala adauga primul element

// printLeague afiseaza rank-ul ligii (cine e pe primul loc).
// se face sortare de fiecare data la apelarea ei

public class League<T extends Team>{
    private ArrayList<Team> teams;
    private String name;

    public League(String name) {
        this.name = name;
        this.teams =  new ArrayList<>();
    }

    public boolean addTeam(Team<T> team){
        if(teams.size() == 0){
            teams.add(team);
            System.out.println("Team " + team.getName() + " added in " + this.getName() + ".");
            return true;
        }
        if(team != null){
            for(Team t: teams){
                if(t.getName() == team.getName()){
                    System.out.println("Team " + t.getName() + " already exist. Not added.");
                    return false;
                } else {
                    teams.add(team);
                    System.out.println("Team " + team.getName() + " added in " +this.getName() + ".");
                    return true;
                }
            }
        } else{
        System.out.println("Team is null");
        return false;}
        return false;
    }

    public void printLeagueState(){
        Collections.sort(teams);
        System.out.println("\nLeague " + this.getName() + " status: ");
        int i = 1;
        for(Team t: teams){
            System.out.println(i + ". " + t.getName() + ", points: " + t.getPoints());
            i++;
        }
    }

    public String getName() {
        return name;
    }
}
