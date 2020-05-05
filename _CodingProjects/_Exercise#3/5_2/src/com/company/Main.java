package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getEulerConstant();
    }

    public static void getEulerConstant() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter accuracy ");
        boolean hasNextInt = scanner.hasNextInt();
        double end = scanner.nextDouble();
        scanner.close();

        if (hasNextInt && end > 0) {

            for (double n = 1; n != end; n+= 1000) {

                double e = Math.pow(1 + (double) 1 / n, n);
                System.out.println(e);
            }

        }
    }
}
