package com.company.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge8 {

    public static void main(String[] args) {

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher = pattern.matcher(challenge8);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
