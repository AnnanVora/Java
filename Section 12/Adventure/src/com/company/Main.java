package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        createAddExits();
        System.out.println(locations.get(1).getLocationID());

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            boolean first = true;
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are - ");
            for (String exit : exits.keySet()) {
                if (first) {
                    System.out.print(exit);
                    first = false;
                } else {
                    System.out.print(", " + exit);
                }
            }
            System.out.println();

            String[] direction = scanner.nextLine().split(" ");

            switch (direction[direction.length - 1].toUpperCase()) {
                case "NORTH":
                    direction[direction.length - 1] = "N";
                    break;
                case "SOUTH":
                    direction[direction.length - 1]  = "S";
                    break;
                case "WEST":
                    direction[direction.length - 1] = "W";
                    break;
                case "EAST":
                    direction[direction.length - 1] = "E";
                    break;
                case "QUIT":
                    direction[direction.length - 1] = "Q";
                    break;
            }
            if (exits.containsKey(direction[direction.length - 1])) {
                loc = exits.get(direction[direction.length - 1]);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }

    public static void createAddExits() {

        Map<String, Integer> tempExit;

        tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

    }
}
