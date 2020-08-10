package com.annan.section7.Encapsulation;

public class Main {

    public static void main(String[] args) {
//
//        Player player = new Player();
//
//        player.fullName = "Annan";
//        // player.health = 100;
//        player.weapon = "Sniper";
//
//        int damage = 36;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 78;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Annan", 100, "Rocket Launcher");
        System.out.println("Initial health is " + player.getHitPoints());
        player.loseHealth(72);
    }
}
