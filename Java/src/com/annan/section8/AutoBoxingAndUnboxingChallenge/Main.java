package com.annan.section8.AutoBoxingAndUnboxingChallenge;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Reserve Bank Of India");

        bank.addBranch("Mumbai");

        bank.addCustomer("Mumbai", "Annan", 1000.33);
        bank.addCustomer("Mumbai", "Anaisha", 500.66);

        bank.addBranch("Bangalore");

        bank.addCustomer("Bangalore", "Kehan", 1500.99);

        bank.addCustomerTransaction("Mumbai", "Annan", 10000);
        bank.addCustomerTransaction("Mumbai", "Annan", 50000);

        bank.addCustomerTransaction("Mumbai", "Anaisha", 10000);
        bank.addCustomerTransaction("Mumbai", "Anaisha", 20000);

        bank.addCustomerTransaction("Bangalore", "Kehan", 10000);
        bank.addCustomerTransaction("Bangalore", "Kehan", 100000);

        bank.listCustomers("Mumbai", true);
        bank.listCustomers("Bangalore", false);

    }
}
