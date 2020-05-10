package com.company;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number");
        this.x = x.nextInt();
    }

    public void x() {

        System.out.println("Enter a number: \r");

        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " = " + (x * this.x));
        }
    }
}
