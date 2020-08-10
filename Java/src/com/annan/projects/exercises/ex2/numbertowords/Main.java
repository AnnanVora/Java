package com.annan.projects.exercises.ex2.numbertowords;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        expandNumber();
    }

    public static void expandNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to expand");
        boolean isInt = scanner.hasNextInt();
        int number = scanner.nextInt();
        scanner.close();

        if (!isInt) {
            return;
        }

        if (number == 0) {
            System.out.println("zero");
            return;
        }
        if (number < 0) {
            System.out.print("-ve ");
            number = -number;
        }

        while (number > 0) {

            if (number < Math.pow(10, 9)) {

                switch (getDigitCount(number)) {
                    case 9:
                    case 8:
                        System.out.print(getTwoDigitStr(number / (int) Math.pow(10, 7)) + " crore ");
                        number = number % (int) Math.pow(10, 7);
                        break;

                    case 7:
                    case 6:
                        System.out.print(getTwoDigitStr(number / (int) Math.pow(10, 5)) + " lakh ");
                        number = number % (int) Math.pow(10, 5);
                        break;

                    case 5:
                    case 4:
                        System.out.print(getTwoDigitStr(number / (int) Math.pow(10, 3)) + " thousand ");
                        number = number % (int) Math.pow(10, 3);
                        break;

                    case 3:
                        int hundred = number / 100;
                        System.out.print(getUnitStr(hundred) + " hundred ");
                        number = number % 100;
                        break;

                    case 2:
                    case 1:
                        System.out.print(getTwoDigitStr(number));
                        number = 0;
                        break;

                }
            } else {
                System.out.println("Number too large");
                break;
            }
        }
    }

    private static String getTwoDigitStr(int number) {
        int tensValue = number / 10;
        if (tensValue == 1) {
            return getTeenStr(number);
        }
        return getTensStr(tensValue) + " " + getUnitStr(number % 10);
    }

    private static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        if (number > 0) {
            while (number != 0) {
                number /= 10;
                count++;
            }
        } else {
            count = 1;
        }
        return count;
    }

    private static String getTeenStr(int number) {

        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "0";
        }
    }

    private static String getUnitStr(int number) {

        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";

        }
    }

    private static String getTensStr(int number) {

        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";

        }
    } // all methods
}
