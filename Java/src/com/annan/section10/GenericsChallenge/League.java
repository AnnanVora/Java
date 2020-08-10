package com.annan.section10.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private final String name;
    private final ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }
}
