package com.annan.section6.InheritanceChallenge;

public class Hurricane extends Car {

    private final int roadServiceMonths;

    public Hurricane(int roadServiceMonths) {
        super("Outlander", "2WD", 5, 2, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 80) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 140) {
            changeGear(3);
        } else if (newVelocity > 140 && newVelocity <= 220) {
            changeGear(4);
        } else if (newVelocity > 220 && newVelocity <= 280) {
            changeGear(5);
        } else if (newVelocity > 280 && newVelocity <= 330) {
            changeGear(5);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }


    }

}
