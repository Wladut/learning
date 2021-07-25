package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    //clasa team are parametru generic T de tipul Player, deci doar clasele care
    //implementeaza Player sunt acceptate (nu  si String de ex.)
    // si implementeaza interfata Comparable care contine compareTo ce trebuie implementate (mandatory)
    // Comparable are  parametru generic de tipul Teams cu parametru generic T

    // poate extinde dintr-o clasa si sa implementeze interfete
    // <T extends Player & Coach & Manager> ex.

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)){

            // nu mai e nevoie de cast (Player) player, deoarece T este restrictionat
            // ca fiind de tipul Player <T extends Player>

            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numberPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String  message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " drew with  ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {

        //this.ranking() este obiectul curent, deci se compara la fiecare clasa

        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
