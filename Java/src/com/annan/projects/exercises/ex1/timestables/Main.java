package com.annan.projects.exercises.ex1.timestables;

public class Main {

    public static void main(String[] args) {

        knowYourTables();
    }

    public static void knowYourTables() {

        int number = 10;
        int range = 15;

        for (int i = 1; i <= number; ++i) {
            System.out.println(i + " times table");

            for (int j = 1; j <= range; ++j) {

                System.out.println(j + " * " + i + " = " + i * j);
            }
            System.out.println();
        }
    }
}
