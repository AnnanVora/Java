package com.annan.section17.RegularExpressionsChallenge.part1;

public class Challenge6 {

    public static void main(String[] args) {

        String challenge5 = "aabccccccccdddefffg";

        System.out.println(challenge5.matches("^a{2}bc{8}d{3}ef{3}g$"));
    }
}
