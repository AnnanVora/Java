package com.company.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge10 {

    public static void main(String[] args) {

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher = pattern.matcher(challenge10);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.start(1) + " to " + (matcher.end(1)  -  1));
        }

    }
}