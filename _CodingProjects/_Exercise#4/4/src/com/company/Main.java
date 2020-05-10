package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[] {21, 34, 41, 22, 35};
        int[] values2 = new int[] {61, 34, 45, 21, 11};

        System.out.println(getDuplicates(values, values2));

    }

    public static ArrayList<Integer> getDuplicates(int[] array, int[] array2) {

        int length = Math.max(array.length, array2.length);
        ArrayList<Integer> duplicates = new ArrayList<>();

        duplicates = contains(array, array2);

        return duplicates;
    }

    public static ArrayList<Integer> contains(int[] arr1, int[] arr2) {

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i : arr1) {

            for (int j : arr2) {

                if (i == j) {
                    duplicates.add(j);
                }
            }
        }

        return duplicates;
    }
}
