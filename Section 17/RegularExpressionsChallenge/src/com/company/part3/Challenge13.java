package com.company.part3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge13 {

    public static void main(String[] args) {

        String challenge13 = "11111-1111";
        Pattern pattern = Pattern.compile("^\\d{5}-\\d{4}$");
        Matcher matcher = pattern.matcher(challenge13);

        System.out.println(matcher.matches());
    }
}
