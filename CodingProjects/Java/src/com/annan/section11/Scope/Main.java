package com.annan.section11.Scope;

public class Main {

    public static void main(String[] args) {

        String varFour = "This is private to main()"; // Access to Main and main()

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass= scopeInstance.new InnerClass();
        // FIXME: Will not run
        // Need to uncomment every time you want to run
//        System.out.println("varThree is not accessible here " + innerClass.varThree);
    }
}
