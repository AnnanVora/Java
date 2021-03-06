package com.annan.section7.CompositionChallenge;

public class Lamp {

    private final String style;
    private final boolean battery;
    private final int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }
}
