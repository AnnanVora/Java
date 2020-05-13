package com.company;

public class Star extends HeavenlyBody {

    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        return super.addSatellite(satellite);
    }
}
