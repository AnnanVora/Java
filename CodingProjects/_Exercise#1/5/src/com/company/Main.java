package com.company;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2020;
        String currentMonth = "Apr";
        int currentDate = 24;
        getAgeWithBirth(2007, "Aug", 27, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2010, "oct", 15, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1974, "oct", 13, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1979, "jan", 26, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1944, "Sep", 13, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1939, "June", 18, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1999, "sep", 5, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1970, "apr", 26, currentYear, currentMonth, currentDate);
        getAgeWithBirth(1972, "apr", 4, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2020, "apr", 23, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2020, "apr", 24, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2020, "apr", 25, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2018, "apr", 23, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2018, "apr", 24, currentYear, currentMonth, currentDate);
        getAgeWithBirth(2018, "apr", 25, currentYear, currentMonth, currentDate);
    }

    public static void getAgeWithBirth(int year, String monthStr, int date, int untilYear, String untilMonthStr, int untilDate) {

        int month = convertMonth(monthStr);
        int untilMonth = convertMonth(untilMonthStr);
        int diffYear = 0;
        int diffMonth = 0;
        int diffDate = 0;

        if (year < 0 || untilYear < 0 || month == -1 || untilMonth == -1 || date <= 0 || date > 31) {
            System.out.println("Invalid Value(s)");
            return;
        }

        if ((year > untilYear) || ((year == untilYear) && ((month > untilMonth) || (month == untilMonth && date > untilDate)))) {
            System.out.println("You are not born yet!");
            return;
        }

        if (untilMonth < month) {
            diffYear = untilYear - year - 1;
        } else if (untilMonth > month) {
            diffYear = untilYear - year;
        } else {
            if (untilDate < date) {
                diffYear = untilYear - year - 1;
            } else {
                diffYear = untilYear - year;
            }
        }

        if (untilMonth >= month) {
            diffMonth = untilMonth - month;
        } else {
            diffMonth = 12 + untilMonth - month;
        }

        if (diffMonth > 0 && untilDate <= date) {
            --diffMonth;
        } else if (diffMonth == 0 && date > untilDate){
            diffMonth = 11;
        }

        if (untilDate >= date) {
            diffDate = untilDate - date;
        } else {
            diffDate = 30 - (date - untilDate);
        }

        System.out.println(diffYear + " years, " + diffMonth + " months, " + diffDate + " days.");
    }

    public static int convertMonth(String month) {
        
        int numberOfMonth;
        switch (month.toLowerCase()) {
            case "january":
            case "jan":
                numberOfMonth = 1;
                break;

            case "february":
            case "feb":
                numberOfMonth = 2;
                break;

            case "march":
            case "mar":
                numberOfMonth = 3;
                break;
            case "april":
            case "apr":
                numberOfMonth = 4;
                break;

            case "may":
                numberOfMonth = 5;
                break;

            case "june":
                numberOfMonth = 6;
                break;

            case "july":
            case "jul":
                numberOfMonth = 7;
                break;

            case "august":
            case "aug":
                numberOfMonth = 8;
                break;

            case "september":
            case "sep":
                numberOfMonth = 9;
                break;

            case "october":
            case "oct":
                numberOfMonth = 10;
                break;

            case "november":
            case "nov":
                numberOfMonth = 11;
                break;

            case "december":
            case "dec":
                numberOfMonth = 12;
                break;

            default:
                return -1;
        }

        return numberOfMonth;
    }
}
