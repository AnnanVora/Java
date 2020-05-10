package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> values2 = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(6);
        values.add(2);
        values.add(5);
        values.add(7);

        values2.add(3);
        values2.add(4);
        values2.add(6);
        values2.add(2);

        System.out.println(subSeqIdx(values, values2));
    }

    public static int subSeqIdx(ArrayList<Integer> array, ArrayList<Integer> array2) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i <= array2.size(); i++) {

            if (array2.contains(array.get(i))) {
                temp.add(1);
                final int x = i;
            }
        }

        if (temp.contains(0)) {
            return -1;
        }
        return (array.indexOf(array.get(x)) - (array2.size())) + 1;
    }
}
