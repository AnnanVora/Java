package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone housePhone;
        housePhone = new DeskPhone(26289080);
        housePhone.powerOn();
        housePhone.callPhone(26289080);
        housePhone.answer();

        housePhone = new MobilePhone(26281230);
        housePhone.powerOn();
        housePhone.callPhone(26281230);
        housePhone.answer();
    }
}
