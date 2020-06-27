package com.annan.section11.AccessModifiers;

interface Accessible { // Only to other classes in the same package implementing this method

    int SOME_CONSTANT = 100; // Read only to other classes in the same package
    public void methodA(); // Read only to other classes in the same package
    void methodB(); // Read only to other classes in the same package
    boolean methodC(); // Read only to other classes in the same package
}
