package com.annan.section12.CollectionsAndMaps;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                return Double.compare(seat1.getPrice(), seat2.getPrice());
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 400.00;
                if (row < 'D') {
                    price = 320.00;
                } else if (row > 'F') {
                    price = 500;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {

        Seat requestedSeat = new Seat(seatNumber, 0);
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int compare = midVal.getSeatNumber().compareTo(seatNumber);

            if (compare < 0)
                low = mid + 1;
            else if (compare > 0)
                high = mid - 1;
            else
                return seats.get(mid).reserve();
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    // testing purposes
    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat>  {
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " is already reserved");
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Seat " + seatNumber + " reservation canceled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
