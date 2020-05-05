package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(getMax());
        System.out.println(getMin());
    }

    public static String getMax() {

        Scanner scanner = new Scanner(System.in);

        int[] myIntegers = new int[5];
        System.out.println("Enter 5 numbers.");

        for (int i = 0; i < myIntegers.length; ++i) {

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                myIntegers[i] = scanner.nextInt();
            } else {
                break;
            }
        }
        int max = myIntegers[0];

        for (int i = 1; i < myIntegers.length; ++i) {

            if (myIntegers[i] > max) {
                max = myIntegers[i];
            }
        }

        return "Max of these numbers is " + max;
    }

    public static String  getMin() {

        Scanner scanner = new Scanner(System.in);

        int[] myIntegers = new int[5];
        System.out.println("Enter 5 numbers.");

        for (int i = 0; i < myIntegers.length; ++i) {

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                myIntegers[i] = scanner.nextInt();
            } else {
                break;
            }
        }
        int min = myIntegers[0];

        for (int i = 1; i < myIntegers.length; ++i) {

            if (myIntegers[i] < min) {
                min = myIntegers[i];
            }
        }

        return "Min of these numbers is " + min;
    }
}
