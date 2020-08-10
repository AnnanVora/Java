package com.annan.section6.Constructors;

public class VipCustomer {

    private final String name;
    private final double creditLimit;
    private final String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.00, "default.email.com");
    }


    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unkown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
