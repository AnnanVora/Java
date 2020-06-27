package com.annan.section7.CompositionChallenge;

public class BedRoom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celing celing;
    private Bed bed;
    private Lamp lamp;

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

