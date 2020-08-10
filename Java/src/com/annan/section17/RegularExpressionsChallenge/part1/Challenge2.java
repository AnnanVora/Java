package com.annan.section17.RegularExpressionsChallenge.part1;

public class Challenge2 {

    public static void main(String[] args) {

        String challenge1 = "I want a ball.";
        String challenge2 = "I want a bike.";

        System.out.println(challenge2.matches("I want a (bike|ball)."));
    }
}
