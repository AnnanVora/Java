package com.company;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 0;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char myLetter = 'A';

        switch(myLetter) {
            case 'A':
                System.out.println("It is an A");
                break;
            case 'B':
                System.out.println("It is a B");
                break;
            case 'C':
                System.out.println("It is a C");
                break;
            case 'D':
                System.out.println("It is a D");
                break;
            case 'E':
                System.out.println("It is an E");
                break;
            default:
                System.out.println("not found");
        }

        String month = "AuGUSt";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "august":
                System.out.println("Aug");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
