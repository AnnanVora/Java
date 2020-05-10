package com.company;

public class SomeClass {

    private static int classCounter;
    public final int INSTANCE_NUMBER;

    public SomeClass(String name) {
        classCounter++;
        INSTANCE_NUMBER = classCounter;
        System.out.println(name + " created, instance is " + INSTANCE_NUMBER);
    }

    public int getINSTANCE_NUMBER() {
        return INSTANCE_NUMBER;
    }
}
