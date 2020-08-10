package com.annan.section7.CompositionChallenge;

public class BedRoom {

    private final String name;
    private final Wall wall1;
    private final Wall wall2;
    private final Wall wall3;
    private final Wall wall4;
    private final Celing celing;
    private final Bed bed;
    private final Lamp lamp;

    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celing celing, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.celing = celing;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}

