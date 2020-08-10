package com.annan.section9.Abstraction;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Husky");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Alexandrine");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
