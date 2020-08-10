package com.annan.projects.exercises.ex1.LCM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        lowestCommonMultiple();
    }

    public static void lowestCommonMultiple() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        boolean isNextInt = scanner.hasNextInt();
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter another number");
        boolean hasNextInt = scanner.hasNextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        if (!hasNextInt || !isNextInt || number1 <= 0 || number2 <= 0) {
            System.out.println("Invalid Value");
            return;
        }

        int lowestCommonMultiple = number1 * number2;

        if (number1 % number2 == 0) {
            lowestCommonMultiple = number1;
        } else if (number2 % number1 == 0) {
            lowestCommonMultiple = number2;
        }

        for (int i = number1; i < number1 * number2; i++) {

            if (i % number1 == 0 && i % number2 == 0) {
                lowestCommonMultiple = i;
                break;
            }
        }

        System.out.println("The LCM of these two numbers is " + lowestCommonMultiple);
    }
}
