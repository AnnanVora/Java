package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getPi();
    }

    public static void getPi() {

        Scanner scanner  = new  Scanner(System.in);
        System.out.println("Enter number of terms");
        boolean hasNextInt = scanner.hasNextInt();
        int end = scanner.nextInt();
        double fraction = 0;

        if (hasNextInt) {

            for (int i = end; i >= 0; i--) {
                fraction = Math.pow((2 * i + 1), 2) / (2 + fraction);
            }
            double pi = 4 / (1 + fraction);
            System.out.println(pi);
        }
    }
}
