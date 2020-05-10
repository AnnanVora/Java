package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> values2 = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        values2.add(3);
        values2.add(4);
        values2.add(5);
        values2.add(6);

        System.out.println(subSeqIdx(values, values2));
    }

    public static int subSeqIdx(ArrayList<Integer> array, ArrayList<Integer> array2) {

        boolean firstTime = false;
        boolean first = true;
        ArrayList<Integer> temp = new ArrayList<>();
        int x = 0;
        for (int i = 0; i <= array2.size() - 1; i++) {

            if (array.contains(array2.get(i)) && first) {
                firstTime = true;
                first = false;
            }

            if (array.contains(array2.get(i)) && firstTime) {
                temp.add(1);
                x = array.indexOf(array2.get(i));
                firstTime = false;
            } else if (array2.contains(array.get(i))){
                temp.add(1);
            }
        }

        if (temp.contains(0)) {
            return -1;
        }
        return (array.indexOf(array.get(x)) - (array2.size())) + 1;
    }
}
