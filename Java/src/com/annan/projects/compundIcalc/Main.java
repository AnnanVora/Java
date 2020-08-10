package com.annan.projects.compundIcalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getFutureValue();
    }

    public static void getFutureValue() {

        Scanner scanner = new Scanner(System.in);

        double principalValue = 0;
        double ratePA = 0;
        double timeYears = 0;

        System.out.println("Enter Principal Value:");
        boolean hasNextDouble = scanner.hasNextDouble();

        while (true) {

            hasNextDouble = false;
            hasNextDouble = scanner.hasNextDouble();

            if (hasNextDouble) {
                principalValue = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid Value.");
                scanner.nextLine();
                System.out.println("Enter Principal Value");
                continue;
            }
        }

        while (true) {

            System.out.println("Enter Rate per annum");
            hasNextDouble = false;
            hasNextDouble = scanner.hasNextDouble();

            if (hasNextDouble) {
                ratePA = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid Value.");
                scanner.nextLine();
                continue;
            }
        }

        while (true) {

            System.out.println("Enter Time period in years");
            hasNextDouble = false;
            hasNextDouble = scanner.hasNextDouble();

            if (hasNextDouble) {
                timeYears = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid Value.");
                scanner.nextLine();
                continue;
            }
        }

        double compoundedAmount = principalValue * Math.pow((1 + (ratePA / 100)), timeYears);

        System.out.println("Final amount after compounding on ₹" + principalValue);
        System.out.println("at the rate of " + ratePA + "% per annum");
        System.out.println("for " + timeYears + " years is: " + compoundedAmount);

    }
}
