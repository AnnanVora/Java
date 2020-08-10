package com.annan.section12.SetsChallenge;

public class Star extends HeavenlyBody {

    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        return super.addSatellite(satellite);
    }
}
