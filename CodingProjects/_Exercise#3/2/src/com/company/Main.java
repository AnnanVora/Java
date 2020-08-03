package com.company;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getPi();
    }

    public static void getPi() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter accuracy");
            boolean hasNextBigD = scanner.hasNextBigDecimal();
            BigDecimal pi = new BigDecimal("0.0");

            if (hasNextBigD) {

                BigDecimal end = scanner.nextBigDecimal();

                if (end.compareTo(new BigDecimal("0")) < 0) {
                    continue;
                }

                for (BigDecimal k = new BigDecimal("0"); k.compareTo(end) < 0; k = k.add(new BigDecimal("1"))) {

                    BigDecimal term = new BigDecimal("0.0");
                    term = term.add(Calculator.power(new BigDecimal("2"), k.add(new BigDecimal("1"))));
                    term = term.multiply(Calculator.power(Calculator.getFactorial(k), new BigDecimal("2")));
                    term = term.divide(Calculator.getFactorial((k.multiply(new BigDecimal("2"))).add(new BigDecimal("1"))), MathContext.DECIMAL128);

                    pi = pi.add(term);
                }

                System.out.println(pi);
            } else {
                scanner.close();
                break;
            }
        }
    }
}
