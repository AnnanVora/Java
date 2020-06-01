package com.company;

public class Main {

    public static void main(String[] args) {

        HealthyBurger burger = new HealthyBurger("Veg Patty");
        burger.showAddOns();
        burger.chooseAddOns("tomato", "lettuce", "cheese", "onion", "carrot", "Kale leaves");
        burger.getBill();
    }
}
