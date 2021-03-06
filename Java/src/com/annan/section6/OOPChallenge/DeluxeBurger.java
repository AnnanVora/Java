package com.annan.section6.OOPChallenge;

public class DeluxeBurger extends BaseBurger {

    protected int price = 200;
    private final String bread;
    private final String patty;

    public DeluxeBurger(String bread, String patty) {
        super(bread, patty);
        this.bread = bread;
        this.patty = patty;
    }

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


}
