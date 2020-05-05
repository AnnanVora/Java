package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Celing celing = new Celing(9, "White");

        Bed bed = new Bed("Modern", 3, 2, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 80);

        BedRoom bedRoom = new BedRoom("Annan's", wall1, wall2, wall3, wall4, celing, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
