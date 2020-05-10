package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<Soccer>> ftbLeague = new League<>("Premier League");
        Team<Soccer> manu = new Team<>("Manchester United");
        Team<Soccer> manc = new Team<>("Manchester City");
        Team<Soccer> chl = new Team<>("Chelsea");
        Team<Soccer> liv = new Team<>("Liverpool");

        League<Team<Baseball>> bbLeague = new League<>("National Football League");
        Team<Baseball> baltrav = new Team<>("Baltimore Ravens");
        Team<Baseball> greenBayPckrs = new Team<>("Green Bay Packers");
        Team<Baseball> newOrlSnts = new Team<>("New Orleans Saints");
        Team<Baseball> nycJts = new Team<>("New York Jets");

        ftbLeague.add(manu);
        ftbLeague.add(manc);
        ftbLeague.add(chl);
        ftbLeague.add(liv);

        bbLeague.add(baltrav);
        bbLeague.add(greenBayPckrs);
        bbLeague.add(newOrlSnts);
        bbLeague.add(nycJts);

        manc.matchResult(manu, 1, 0);
        liv.matchResult(chl, 3, 8);

        nycJts.matchResult(newOrlSnts, 2, 1);
        greenBayPckrs.matchResult(baltrav, 1, 1);


        ftbLeague.showLeagueTable();
        bbLeague.showLeagueTable();
    }
}
