package com.company;
//https://www.jetbrains.com/help/idea/using-breakpoints.html

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Branch argument -> true if transaction is at a branch with a teller
    // Branch argument -> false if transaction is at an ATM
    public double deposit(double amount, boolean isAtBranch) {
        balance += amount;
        return balance;
    }

    // Branch argument -> true if transaction is at a branch with a teller
    // Branch argument -> false if transaction is at an ATM
    public double withdraw(double amount, boolean isAtBranch) {
        if (amount > 500 && !isAtBranch) {
            throw new IllegalArgumentException("Amount too large for an ATM");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }
}
