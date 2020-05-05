package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getPi();
    }

    public static void getPi() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter accuracy");
            boolean hasNextInt = scanner.hasNextInt();
            double pi = 0.0;

            if (hasNextInt) {

                int end = scanner.nextInt();

                if (end < 0) {
                    continue;
                }

                for (int k = 0; k != end; k++) {

                    pi += (((Math.pow(2, (k + 1))) * (Math.pow(getFactorial(k), 2))) / (getFactorial((2 * k) + 1)));
                }

                System.out.println(pi);
            } else {
                scanner.close();
                break;
            }
        }
    }

    public static double getFactorial(int number) {

        double factorial = 1;

        for (; number >= 1; number--) {
            factorial *= number;
        }
        return factorial;
    }

}
