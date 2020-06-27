package com.annan.section17.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String string = "I am a String. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        yourString = yourString.replaceAll("am", "are");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        String secondString = "abcDeeeF12GhhabcDeeiiiijkl99z";
        System.out.println(secondString.replaceAll("secondString", "YYY"));

        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));
        System.out.println(alphanumeric.replaceAll("iiijkl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "x"));
        System.out.println(alphanumeric.replaceAll("[aei]", " I replaced a letter here "));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "x"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "x"));
        System.out.println(newAlphanumeric.replaceAll("[aA-fF3-8]", "x"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f-3-8]", "x"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "x"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "x"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "x"));

        String hasWhitespace = "I have blank spaces and\ta tab, and also a newLine\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\\t", "x"));
        System.out.println(hasWhitespace.replaceAll("\\$", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "x"));
        System.out.println(hasWhitespace.replaceAll("\\w", "x"));
        System.out.println(hasWhitespace.replaceAll("\\b", "x"));

        String thirdAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something else</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + ": " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
        String tNotV = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotV);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence: " + count + ": " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        System.out.println("Enter a phone number for validation");
        String phoneNumber = scanner.nextLine();
        String phoneNumberFormat = "^([(][9][1][)][ ][0-9]{5}[\\-][0-9]{5})$";
        System.out.println("Given phone number for India is " + (phoneNumber.matches(phoneNumberFormat) ? "valid" : "invalid"));

        System.out.println("Enter a VISA card number for validation");
        String visaCardNumber = scanner.nextLine();
        String VISANumberFormat = "^4[0-9]{12}([0-9]{3})?$";
        System.out.println("Given VISA card number is " + (visaCardNumber.matches(VISANumberFormat) ? "valid" : "invalid"));
    }
}