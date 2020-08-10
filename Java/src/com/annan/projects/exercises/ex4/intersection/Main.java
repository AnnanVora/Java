package com.annan.projects.exercises.ex4.intersection;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[]{21, 34, 41, 22, 35};
        int[] values2 = new int[]{61, 34, 45, 41, 21, 11};

        System.out.println(intersection(values, values2));

    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {

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
