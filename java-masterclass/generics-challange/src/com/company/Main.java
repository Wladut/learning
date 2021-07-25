package com.company;

public class Main {

    public static void main(String[] args) {

        Team<FootballTeam> footballTeam1 = new FootballTeam("FootballTeam1");
        Team<FootballTeam> footballTeam2 = new FootballTeam("FootballTeam2");
        Team<FootballTeam> footballTeam3 = new FootballTeam("FootballTeam3");
        Team<FootballTeam> footballTeam4 = new FootballTeam("FootballTeam4");
        Team<FootballTeam> footballTeam5 = new FootballTeam("FootballTeam5");

        Team<BaseballTeam> baseballTeam1 = new BaseballTeam("BaseBallTeam1");

        League<FootballTeam> footballLeague = new League<>("footballLeague");
        League<BaseballTeam> baseballLeague = new League<>("baseballLeague");

        footballLeague.addTeam(footballTeam1);
        footballLeague.addTeam(footballTeam2);
        footballLeague.addTeam(footballTeam3);
        footballLeague.addTeam(footballTeam4);
        footballLeague.addTeam(footballTeam5);
        baseballLeague.addTeam(baseballTeam1);

        footballLeague.printLeagueState();
        baseballLeague.printLeagueState();

        footballTeam1.playGame(footballTeam2, true);
        footballTeam3.playGame(footballTeam1, true);
        footballTeam1.playGame(footballTeam3, false);
        footballTeam2.playGame(footballTeam3, false);
        footballTeam4.playGame(footballTeam2, true);
        footballTeam1.playGame(footballTeam3, false);

        baseballTeam1.playGame(baseballTeam1, true);

        footballLeague.printLeagueState();
        baseballLeague.printLeagueState();

    }
}
