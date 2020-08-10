package com.annan.section11.AccessModifiers;

public class Main {

    public static void main(String[] args) {

        Account annansAccount = new Account("Annan");
        annansAccount.deposit(1000);
        annansAccount.withdraw(500);
        annansAccount.withdraw(-200);
        annansAccount.deposit(-20);
        annansAccount.calculateBalance();

        System.out.println("Balance on account is " + annansAccount.getBalance());
        annansAccount.calculateBalance();


    }
}
