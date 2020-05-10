package com.company;

public class Main {

    public static void main(String[] args) {

        Printer HPDeskJet3545 = new Printer(50, true);
        System.out.println("Initial page count = " + HPDeskJet3545.getPagesPrinted());
        int pagesPrinted = HPDeskJet3545.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + HPDeskJet3545.getPagesPrinted());
        pagesPrinted = HPDeskJet3545.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + HPDeskJet3545.getPagesPrinted());
    }
}
