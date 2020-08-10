package com.annan.section8.ArraysChallenge;

public class Main {

    public static void main(String[] args) {

        int[] values = getIntegers(30);
        printArray(values);
        sortDescending(values);

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + ", ");
        }
    }

    public static int[] getIntegers(int capacity) {

        int[] myIntegers = new int[capacity];

        for (int i = 0; i < myIntegers.length; ++i) {

            myIntegers[i] = (int) (Math.random() * 100);

        }

        return myIntegers;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + ", ");
        }
    }

    public static int[] sortDescending(int[] array) {

        System.out.println("\n" + "\n" + "In descending order");

        int length = array.length;

        for (int i = 0; i < length; ++i) {

            int max = Integer.MIN_VALUE;
            int maxIndex = i;

            for (int j = i; j < length; ++j) {

                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }

            int x = array[i];
            array[i] = max;
            array[maxIndex] = x;
        }

        return array;
    }
}
