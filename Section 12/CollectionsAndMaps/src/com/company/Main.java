package com.company;

import java.util.*;

public class Main {

public static void main(String[] args) {

       Theatre theatre = new Theatre("PVR Versova", 8, 12);
       if (theatre.reserveSeat("D12")) {
           System.out.println("Please pay for D12");
       }

       if (theatre.reserveSeat("B13")) {
           System.out.println("Please pay for B13");
       }

       List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
       Collections.reverse(reverseSeats);
       printList(reverseSeats);

       List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
       priceSeats.add(theatre.new Seat("B00", 320.00));
       priceSeats.add(theatre.new Seat("A00", 320.00));
       priceSeats.sort(Theatre.PRICE_ORDER);
       printList(priceSeats);
   }

   public static void printList(List<Theatre.Seat> list) {
       for (Theatre.Seat seat : list) {
           System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
       }
       System.out.println();
       for (int i = 0; i < 1000; i++) {
           System.out.print("=");
       }
       System.out.println();
       sout "="
   }
}
