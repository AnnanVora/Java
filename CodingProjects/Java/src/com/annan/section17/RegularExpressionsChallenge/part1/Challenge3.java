package com.annan.section17.RegularExpressionsChallenge.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge3 {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball";

        Pattern regexPattern = Pattern.compile("I want a \\w+.");
        Matcher regexMatcher = regexPattern.matcher(challenge1);
        System.out.println(regexMatcher.matches());

        regexMatcher = regexPattern.matcher(challenge2);
        System.out.println(regexMatcher.matches());
    }
}
