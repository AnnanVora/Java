package com.annan.section17.RegularExpressionsChallenge.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge11 {

    public static void main(String[] args) {

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher = pattern.matcher(challenge11);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
