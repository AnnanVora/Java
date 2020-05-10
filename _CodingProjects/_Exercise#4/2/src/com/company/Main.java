package com.company;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[100];
        for (int i = 0; i < values.length; ++i) {
            values[i] = (int) (Math.random() * 100 + 1);
        }
        int numComparisons = sortUsingInsert(values);

        for (int value : values) {
            System.out.println(value);
        }
        System.out.println("Num Comparisons: " + numComparisons);
    }

    public static int sortUsingInsert(int[] array) {

        int index;
        int value;
        int comparisons = 0;

        for (int i = 0; i < array.length; ++i) {
            value = array[i];
            index = i;

            while (index > 0 && array[index - 1] > value) {
                array[index] = array[index - 1];
                --index;
                ++comparisons;
            }

            array[index] = value;
        }
        return comparisons;
    }
}
