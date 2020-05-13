package com.company;

public class DwarfPlanet extends HeavenlyBody {

    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if (satellite.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(satellite);
        } else {
            return false;
        }
    }
}
