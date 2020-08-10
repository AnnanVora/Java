package com.annan.section17.RegularExpressionsChallenge.part3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge12 {

    public static void main(String[] args) {

        String challenge12 = "63384";
        Pattern pattern = Pattern.compile("^\\d{5}$");
        Matcher matcher = pattern.matcher(challenge12);

        System.out.println(matcher.matches());
    }
}
