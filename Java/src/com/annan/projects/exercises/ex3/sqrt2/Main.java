package com.annan.projects.exercises.ex3.sqrt2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getSqrt2();
    }

    public static void getSqrt2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        boolean isInt = scanner.hasNextInt();
        int end = scanner.nextInt();
        double fraction = 0;


        if (isInt) {

            for (int i = end; i >= 0; i--) {
                fraction = 1 / (2 + fraction);
            }

            double sqrt2 = 1 + fraction;
            System.out.println(sqrt2);
        }
    }
}
