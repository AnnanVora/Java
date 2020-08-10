package com.annan.section7.Composition;

public class Motherboard {

    private final String model;
    private final String manufacturer;
    private final int ramSlots;
    private final int cardSlots;
    private final String BIOS;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String BIOS) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.BIOS = BIOS;
    }

    public void loadProgram(String programName) {
        System.out.println(programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBIOS() {
        return BIOS;
    }
}
