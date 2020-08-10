package com.annan.section7.Composition;

public class PC {

    private final Case theCase;
    private final Monitor theMonitor;
    private final Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerOn() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy Graphics
        theMonitor.drawPixelAt(1200, 50, "yellow");
    }

}
