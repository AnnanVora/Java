package com.annan.section7.PolymorphismChallenge;

class Car {

    private final boolean engine;
    private final int cylinders;
    private final int wheels;
    private final String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders + (int) (Math.random() * 5);
    }


    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car is starting...");
        System.out.println("Engine is revving up..");
    }

    public void accelerate(int rate) {
        System.out.println("Car is starting to speed up by " + rate + " km/h");
    }

    public void brake() {
        System.out.println("Car has stopped");
    }

}

class Ferrari extends Car {

    public Ferrari() {
        super(10, "Ferrari");
    }

    @Override
    public String getName() {
        return "Ferrari";
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari is starting...");
        System.out.println("Engine is revving up...");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Ferrari is starting to speed up by " + rate + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari has stopped");
    }
}

class Porsche extends Car {

    public Porsche() {
        super(6, "Porsche");
    }

    @Override
    public String getName() {
        return "Porsche";
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche is starting...");
        System.out.println("Engine is revving up...");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Porsche is starting to speed up by " + rate + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Porsche has stopped");
    }
}

class Lamborghini extends Car {

    public Lamborghini() {
        super(8, "Lamborghini");
    }

    @Override
    public String getName() {
        return "Lamborghini";
    }

    @Override
    public void startEngine() {
        System.out.println("Lamborghini is starting...");
        System.out.println("Engine is revving up...");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Lamborghini is starting to speed up by " + rate + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Lamborghini has stopped");
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "SX4");
        Ferrari ferrari = new Ferrari();
        Lamborghini lamborghini = new Lamborghini();
        Porsche porsche = new Porsche();
        car.accelerate(40);
        car.startEngine();
        car.brake();
        ferrari.startEngine();
        lamborghini.startEngine();
        porsche.startEngine();
        ferrari.accelerate(180);
        lamborghini.accelerate(120);
        porsche.accelerate(90);
        ferrari.brake();
        lamborghini.brake();
        porsche.brake();
    }
}
