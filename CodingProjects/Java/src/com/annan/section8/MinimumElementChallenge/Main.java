package com.annan.section8.MinimumElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min = " + returnedMin);
    }

    public static int[] readIntegers(int count) {

        int[] myIntegers = new int[count];

            for (int i = 0; i < myIntegers.length; i++) {
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                scanner.nextLine();
                myIntegers[i] = number;
            }

        return myIntegers;
    }

    public static int findMin(int [] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; ++i) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
