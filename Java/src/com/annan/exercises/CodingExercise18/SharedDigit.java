package com.annan.exercises.CodingExercise18;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(16, 42));
    }

    public static boolean hasSharedDigit(int firstValue, int secondValue) {
        if (firstValue > 99 || firstValue < 10 || secondValue < 10 || secondValue > 99) {
            return false;
        }

        int firstFirstValue = firstValue / 10;
        int secondFirstValue = firstValue % 10;
        int firstSecondValue = secondValue / 10;
        int secondSecondValue = secondValue % 10;

        if(        firstFirstValue == firstSecondValue
                || firstFirstValue == secondSecondValue
                || secondFirstValue == firstSecondValue
                || secondFirstValue == secondSecondValue) {

            return true;
        } else {
            return false;
        }
    }
}
