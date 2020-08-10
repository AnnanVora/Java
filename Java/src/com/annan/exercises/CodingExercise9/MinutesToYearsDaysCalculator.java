package com.annan.exercises.CodingExercise9;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        long minutesInADay = 24 * 60;
        long minutesInAYear = 365 * minutesInADay;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes > 0) {
            System.out.println(minutes + " min = " + (int)(minutes/minutesInAYear) + " y and " + (int)((minutes % minutesInAYear) / minutesInADay) + " d");
        } else {
            System.out.println("0 min = 0 y and 0 d ");
        }
    }
}
