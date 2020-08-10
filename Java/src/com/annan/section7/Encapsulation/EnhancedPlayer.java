package com.annan.section7.Encapsulation;

public class EnhancedPlayer {

    private final String name;
    private int hitPoints = 100;
    private final String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
