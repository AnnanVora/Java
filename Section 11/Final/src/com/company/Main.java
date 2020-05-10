package com.company;

public class Main {

    public static void main(String[] args) {

//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//        System.out.println(one.getINSTANCE_NUMBER());
//        System.out.println(two.getINSTANCE_NUMBER());
//        System.out.println(three.getINSTANCE_NUMBER());
//
//        System.out.println(Math.PI);
//
//        int pw = 674312;
//        ExtendedPassword password = new ExtendedPassword(pw);
//        password.storePassword();
//        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
