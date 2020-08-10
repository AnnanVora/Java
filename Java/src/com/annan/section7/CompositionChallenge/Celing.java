package com.annan.section7.CompositionChallenge;

public class Celing {

    private final int height;
    private final String paintedColour;

    public Celing(int height, String paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColour() {
        return paintedColour;
    }
}
