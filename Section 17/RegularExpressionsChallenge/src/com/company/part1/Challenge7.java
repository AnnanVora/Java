package com.company.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge7 {

    public static void main(String[] args) {
        String challenge7 = "abcde.45";

        Pattern pattern = Pattern.compile("^[aA-zZ]+\\.\\d+$");
        Matcher matcher = pattern.matcher(challenge7);

        System.out.println(matcher.matches());
    }
}
