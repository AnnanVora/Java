package com.company.part3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge14 {

    public static void main(String[] args) {

        String challenge14 = "11111";
        String challenge14_2 = "11111-1111";
        Pattern pattern = Pattern.compile("\\d{5}-*?\\d{4}?");
        Matcher matcher = pattern.matcher(challenge14);
        Matcher matcher1 = pattern.matcher(challenge14_2);

        System.out.println(matcher.matches() + "\n" + matcher1.matches());
    }
}
