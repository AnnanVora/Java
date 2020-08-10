package com.annan.section9.InnerClassesChallenge;

public class Song {

    private final String title;
    private final double duration;

    public Song(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration + " minutes.";
    }
}
