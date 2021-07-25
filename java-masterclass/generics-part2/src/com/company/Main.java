package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
 //       adelaideCrows.addPlayer(pat);
 //       adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numberPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 3, 1);
     //   adelaideCrows.matchResult(baseballTeam, 1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        //daca avem arraylist de tipul teams din Collections.sort putem sorta
        // elementele folosind  functia compareTo implementata de noi


        ArrayList<Team> teams = new ArrayList<>();
        teams.add(adelaideCrows);
        teams.add(hawthorn);
        teams.add(melbourne);
        teams.add(fremantle);
        Collections.sort(teams);
        System.out.println("Teams sorted: ");
        for(Team i: teams){
            System.out.println(i.getName());
        }
    }
}
