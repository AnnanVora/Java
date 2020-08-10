package com.annan.projects.exercises.ex1.prfactorization;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        getPrimeFactorization();
    }

    public static void getPrimeFactorization() {

        Scanner scanner = new Scanner(System.in);
        boolean isFirstTime = true;

        while (true) {

            System.out.println("Enter number to factorise");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();
                int originalNumber = number;
                scanner.nextLine();

                if (number < 1) {
                    System.out.println("Invalid Value");
                }

                int i = 2;

                do {

                    if (number % i == 0) {

                        if (isPrime(i)) {

                            if (isFirstTime) {
                                System.out.print(i);
                                isFirstTime = false;
                            } else {
                                System.out.print(" X " + i);
                            }
                            number /= i;
                        }
                    }

                    if (number % i != 0) {
                        i++;
                    }
                } while (i <= originalNumber);
                System.out.println();
            } else {
                System.out.println("Invalid Value");
                break;
            }

        }
        scanner.close();
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int j = 2; j < number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }

}