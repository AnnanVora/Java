package com.company;

public class Main {

    public static void main(String[] args) {

        AusFootballPlayer joe = new AusFootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<AusFootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<AusFootballPlayer> melbourne = new Team<>("Melbourne");
        AusFootballPlayer banks = new AusFootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<AusFootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<AusFootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(melbourne, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.points());
        System.out.println(melbourne.getName() + ": " + melbourne.points());
        System.out.println(fremantle.getName() + ": " + fremantle.points());
        System.out.println(hawthorn.getName() + ": " + hawthorn.points());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
