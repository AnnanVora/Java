package com.annan.section4.SecondAndMinuteChallenge;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(3600));
    }

    private static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        long ttlHours = minutes / 60;
        long ttlMinutes = minutes - ttlHours * 60;
        String ttlTime;
        if (seconds == 0) {
            ttlTime = ttlHours + "h " + ttlMinutes + "m " + seconds + "0s";
        } else {
            ttlTime = ttlHours + "h " + ttlMinutes + "m " + seconds + "s";
        }
        return ttlTime;
    }

    private static String getDurationString(long seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }

        long totalMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(totalMinutes, remainingSeconds);
    }
}
