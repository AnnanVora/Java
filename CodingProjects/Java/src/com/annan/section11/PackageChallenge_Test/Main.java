package com.annan.section11.PackageChallenge_Test;

import com.annan.section11.PackageChallenge.Series;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("**********");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.sumFactorial(i));
        }

        System.out.println("**********");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
