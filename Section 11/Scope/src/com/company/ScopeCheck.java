package com.company;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1; // Full access

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int VarTwo = 2; // Access only to timesTwo()
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " times 2 = " + i * VarTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {

        private int varThree = 3; // Access only two InnerClass

        public InnerClass() {
            System.out.println("Inner Class created, varOne is " + varOne + ", varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " times 2 = " + i * ScopeCheck.this.varOne);
            }
        }
    }
}
