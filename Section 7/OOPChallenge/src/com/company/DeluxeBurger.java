package com.company;

public class DeluxeBurger extends BaseBurger {

    private String bread;
    private String patty;

    public DeluxeBurger(String bread, String patty) {
        super(bread, patty);
        this.bread = bread;
        this.patty = patty;
    }

    protected int price = 200;

    public int getPrice() {
        return price;
    }

    @Override
    public String getBread() {
        return this.bread;
    }

    @Override
    public String getPatty() {
        return this.patty;
    }

    @Override
    public void getBill() {
        System.out.println("Your base burger costs \u20b9 200");
        System.out.println("AddOns are as follows: ");
        System.out.println("soft drink -> \u20b9 100");
        System.out.println("chips -> \u20b9 50");
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3, String selectedAddOn4) {
        System.out.println("No add ons are available for this burger");
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3) {
        System.out.println("No add ons are available for this burger");
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2) {
        System.out.println("No add ons are available for this burger");
    }

    @Override
    public void chooseAddOns(String selectedAddOn1) {
        System.out.println("No add ons are available for this burger");
    }

    @Override
    public void showAddOns() {
        System.out.println("No add ons are available for this burger");
    }
}
