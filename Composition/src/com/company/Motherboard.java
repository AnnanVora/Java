package com.company;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String BIOS;

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
