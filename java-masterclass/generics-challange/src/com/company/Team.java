package com.company;

//clasa abstracta Team care contine echipele
//Implementeaza Comparable pentru a implementa compareTo utilizata in
//clasa League pentru Collenctions.sort()

// Contine nume si puncte. Se foloseste Team<T> insemnand clasa generica
// Aici se implementeaza si playGame. Pot juca doar echipe din acelasi tip de instanta
//eg. Team<footballTeam>

// compareTo daca a>b returneaza -1;
// daca a<b returneaza 1;
// daca a==b returneaza 0;

public abstract class Team<T> implements Comparable<Team<T>> {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Team team) {
        if(team != null){
            if(this.points > team.getPoints()){
                return -1;
            } else if (this.points < team.getPoints()){
                return 1;
            } else {
                return 0;
            }
        }
        return -2;
    }

    public boolean playGame(Team<T> opponent, boolean winner){
        if(this.getName() == opponent.getName()){
            System.out.println("Team can't play game with same team.");
            return false;
        }
        if(opponent != null){
            if(winner){
                this.points++;

            } else {
                    opponent.setPoints(opponent.getPoints()+1);
                }
            }
            return true;
        }
    }
