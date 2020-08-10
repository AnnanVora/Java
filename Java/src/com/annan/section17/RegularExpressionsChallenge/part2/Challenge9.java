package com.annan.section17.RegularExpressionsChallenge.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge9 {

    public static void main(String[] args) {

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher = pattern.matcher(challenge9);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
