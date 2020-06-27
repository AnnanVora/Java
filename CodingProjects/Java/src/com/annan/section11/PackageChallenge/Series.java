package com.annan.section11.PackageChallenge;

public class Series {

    public static int sumFactorial(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        int sum = 1;

        if (n == 0) {
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int fibonacci(int n) {

        int nFib = 0;
        int previousFibonacci = 0;
        int printingFibonacci = 1;
        int originalFibonacci = printingFibonacci;

        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {

            for (int i = 1; i < n; i++) {

                printingFibonacci += previousFibonacci;
                nFib = printingFibonacci;
                previousFibonacci = originalFibonacci;
                originalFibonacci = printingFibonacci;
            }
        }

        return nFib;
    }
}
