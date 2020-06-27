package com.annan.section7.Composition;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case myCase = new Case("Xtreme 44", "Dell", "Corsair 400W", dimensions);

        Monitor myMonitor = new Monitor("IPS LED", "LG", 22, new Resolution(2540, 1440));

        Motherboard myMotherboard = new Motherboard("H1k", "ASUS", 4, 5, "UEFI");

        PC myComputer = new PC(myCase, myMonitor, myMotherboard);
        myComputer.powerOn();
        
    }
}
