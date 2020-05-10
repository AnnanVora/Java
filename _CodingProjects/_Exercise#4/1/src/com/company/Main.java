package com.company;

public class Main {

    public static void main(String[] args) {

        int[] values = new int[] {1, 2, 3, 4, 2, 1};
        isPalindrome(values);
    }

    public static void isPalindrome(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] != (array[(array.length - 1) - i])) {
                System.out.println("The array is not a palindrome");
                return;
            }
        }
        System.out.println("The array is a palindrome");
    }
}
