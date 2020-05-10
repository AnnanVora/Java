package com.company;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[] {14, 33, 27, 10, 35, 19, 42, 44};
        for (int i = 0; i < values.length; i++) {
            System.out.println(sortUsingInsert(values)[i]);
        }
    }

    public static int[] sortUsingInsert(int[] array) {

        int element;
        int value;

        for (int i = 0; i < array.length; i++) {
            value = array[i];
            element = i;

            while (element > 0 && array[element - 1] > value) {
                array[element] = array[element - 1];
                element = element - 1;
            }

            array[element] = value;
        }
        return array;
    }
}
