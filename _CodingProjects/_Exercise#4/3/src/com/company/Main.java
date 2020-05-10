package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[] {1, 2, 3, 4};
        int[] values2 = new int[] {3, 4, 5, 6, 7 , 8};

        System.out.println(Arrays.toString(merge(values, values2)));
    }

    public static int[] merge(int[] array, int[] array2) {

        int[] merge = new int[array.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array.length && j < array2.length) {

            if (array[i] < array2[j]) {
                merge[k++] = array[i++];
            } else {
                merge[k++] = array2[j++];
            }
        }

        while (i < array.length) {
            merge[k++] = array[i++];
        }

        while (j < array2.length) {
            merge[k++] = array2[j++];
        }

        return merge;
    }
}

