package com.company;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new com.company.Account("12345", 0.00, "Bob Brown", "myemail@bob.com",
//                 "(087) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account annansAccount = new Account("Annan","annan@email.com", "12345");
//        System.out.println(annansAccount.getNumber() + " name " + annansAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Annan", 100.00, "annan.vora@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
