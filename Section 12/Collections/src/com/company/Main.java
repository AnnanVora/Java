package com.company;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("PVR Versova", 8, 12);
//        theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay \u20b9400");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay \u20b9400");
        }
    }
}
