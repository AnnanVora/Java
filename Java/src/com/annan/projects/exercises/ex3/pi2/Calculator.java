package com.annan.projects.exercises.ex3.pi2;

import java.math.BigDecimal;

public class Calculator {

    static BigDecimal getFactorial(BigDecimal number) {

        BigDecimal factorial = new BigDecimal("1.0");

        for (; number.compareTo(new BigDecimal("0")) > 0; number = number.subtract(new BigDecimal("1"))) {
            factorial = factorial.multiply(number);
        }
        return factorial;
    }

    static BigDecimal power(BigDecimal a, BigDecimal b) {
        if (a.compareTo(new BigDecimal("0")) == 0 && b.compareTo(new BigDecimal("0")) == 0) {
            return (BigDecimal.valueOf((long) Double.NaN));
        } else if (b.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("1");
        } else if (a.compareTo(new BigDecimal("0")) == 0) {
            return new BigDecimal("0");
        }
        if (a.compareTo(new BigDecimal("0")) < 0 && b.compareTo(new BigDecimal(0)) < 0) {
            a = (a.compareTo(new BigDecimal("0")) < 0 ? new BigDecimal("0").subtract(a) : a);
            b = (b.compareTo(new BigDecimal("0")) < 0 ? new BigDecimal("0").subtract(b) : b);
        }
        BigDecimal oga = a;

        for (BigDecimal i = new BigDecimal("1"); i.compareTo(b) != 0; i = i.add(new BigDecimal("1"))) {
            a = a.multiply(oga);
        }
        return a;
    }
}
