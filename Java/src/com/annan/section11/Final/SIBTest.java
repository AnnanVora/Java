package com.annan.section11.Final;

public class SIBTest {

    public static final String owner;

    static {
        owner = "Annan";
        System.out.println("Static initialization block called");
    }

    static {
        System.out.println("2nd initialization black called");
    }

    public SIBTest() {
        System.out.println("SIB Constructor called");
    }

    public void someMethod() {
        System.out.println("someMethod() block called");
    }
}
