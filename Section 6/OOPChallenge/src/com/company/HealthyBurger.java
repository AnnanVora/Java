package com.company;

public class HealthyBurger extends BaseBurger {

    private String bread;
    private String patty;
    private String addOn1 = "Tomato";
    private String addOn2 = "Lettuce";
    private String addOn3 = "Onion";
    private String addOn4 = "Cheese";
    private String addOn5 = "Pickle";
    private String addOn6 = "Carrot";
    private String addOn7 = "Mustard";
    private String addOn8 = "Avocado";
    private String addOn9 = "Kale leaves";
    private String addOn10 = "Cucumber";
    private String selectedAddOn1;
    private String selectedAddOn2;
    private String selectedAddOn3;
    private String selectedAddOn4;
    private String selectedAddOn5;
    private String selectedAddOn6;

    private int tomato = 20;
    private int lettuce = 15;
    private int onion = 18;
    private int cheese = 25;
    private int pickle = 15;
    private int carrot = 20;
    private int mustard = 15;
    private int avocado = 25;
    private int basePrice = 280;
    private int kaleLeaves = 20;
    private int cucumber = 16;
    

    public HealthyBurger(String patty) {
        super("Brown rye roll", patty);
    }

    @Override
    public void showAddOns() {

        System.out.println("AddOns to choose for this burger are: ");
        System.out.println(addOn1 + " -> \u20b9 " + tomato);
        System.out.println(addOn2 + " -> \u20b9 " + lettuce);
        System.out.println(addOn3 + " -> \u20b9 " + onion);
        System.out.println(addOn4 + " -> \u20b9 " + cheese);
        System.out.println(addOn5 + " -> \u20b9 " + pickle);
        System.out.println(addOn6 + " -> \u20b9 " + carrot);
        System.out.println(addOn7 + " -> \u20b9 " + mustard);
        System.out.println(addOn8 + " -> \u20b9 " + avocado);
        System.out.println(addOn9 + " -> \u20b9 " + kaleLeaves);
        System.out.println(addOn10 + " -> \u20b9 " + cucumber);
        System.out.println("\nYou can choose upto 6 add ons");
        System.out.println();
    }


    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3, String selectedAddOn4, String selectedAddOn5, String selectedAddOn6) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = selectedAddOn4;
        this.selectedAddOn5 = selectedAddOn5;
        this.selectedAddOn6 = selectedAddOn6;
    }

    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3, String selectedAddOn4, String selectedAddOn5) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = selectedAddOn4;
        this.selectedAddOn5 = selectedAddOn5;
        this.selectedAddOn6 = "None";
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3, String selectedAddOn4) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = selectedAddOn4;
        this.selectedAddOn5 = "None";
        this.selectedAddOn6 = "None";
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = "None";
        this.selectedAddOn5 = "None";
        this.selectedAddOn6 = "None";
    }

    @Override
    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = "None";
        this.selectedAddOn4 = "None";
        this.selectedAddOn5 = "None";
        this.selectedAddOn6 = "None";
    }

    @Override
    public void chooseAddOns(String selectedAddOn1) {
        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = "None";
        this.selectedAddOn3 = "None";
        this.selectedAddOn4 = "None";
        this.selectedAddOn5 = "None";
        this.selectedAddOn6 = "None";
    }

    @Override
    public String getBread() {
        return "Brown rye bread roll";
    }

    @Override
    public void getBill() {

        int totalPrice = 280;
        int selectedAddOn1P = 0;
        int selectedAddOn2P = 0;
        int selectedAddOn3P = 0;
        int selectedAddOn4P = 0;
        int selectedAddOn5P = 0;
        int selectedAddOn6P = 0;

        switch (selectedAddOn1.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn1P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn1P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn1P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn1P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn1P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn1P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn1P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn1P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn1P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn1P = cucumber;
                break;
        }

        switch (selectedAddOn2.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn2P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn2P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn2P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn2P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn2P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn2P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn2P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn2P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn2P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn2P = cucumber;
                break;
        }

        switch (selectedAddOn3.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn3P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn3P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn3P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn3P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn3P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn3P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn3P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn3P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn3P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn3P = cucumber;
                break;
        }

        switch (selectedAddOn4.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn4P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn4P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn4P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn4P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn4P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn4P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn4P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn4P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn4P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn4P = cucumber;
                break;
        }

        switch (selectedAddOn5.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn5P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn5P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn5P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn5P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn5P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn5P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn5P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn5P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn5P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn5P = cucumber;
                break;
        }

        switch (selectedAddOn6.toLowerCase()) {
            case "tomato":
                totalPrice += tomato;
                selectedAddOn6P = tomato;
                break;
            case "lettuce":
                totalPrice += lettuce;
                selectedAddOn6P = lettuce;
                break;
            case "onion":
                totalPrice += onion;
                selectedAddOn6P = onion;
                break;
            case "cheese":
                totalPrice += cheese;
                selectedAddOn6P = cheese;
                break;
            case "pickle":
                totalPrice += pickle;
                selectedAddOn6P = pickle;
                break;
            case "carrot":
                totalPrice += carrot;
                selectedAddOn6P = carrot;
                break;
            case "mustard":
                totalPrice += mustard;
                selectedAddOn6P = mustard;
                break;
            case "avocado":
                totalPrice += avocado;
                selectedAddOn6P = avocado;
                break;
            case "kale leaves":
                totalPrice += kaleLeaves;
                selectedAddOn6P = kaleLeaves;
                break;
            case "cucumber":
                totalPrice += cucumber;
                selectedAddOn6P = cucumber;
                break;
        }

        System.out.println("Your base healthy burger costs \u20b9 280");
        System.out.println("AddOns are as follows: ");

        if (selectedAddOn6.equals("None") && selectedAddOn5.equals("None") && selectedAddOn4.equals("None") && selectedAddOn3.equals("None") && selectedAddOn2.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
        } else if (selectedAddOn5.equals("None") && selectedAddOn4.equals("None") && selectedAddOn3.equals("None") && selectedAddOn2.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
        } else if (selectedAddOn4.equals("None") && selectedAddOn3.equals("None") && selectedAddOn2.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
        } else if (selectedAddOn4.equals("None") && selectedAddOn3.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
            System.out.println(selectedAddOn4 + " -> \u20b9 " + selectedAddOn4P);
        } else if (selectedAddOn4.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
            System.out.println(selectedAddOn4 + " -> \u20b9 " + selectedAddOn4P);
            System.out.println(selectedAddOn5 + " -> \u20b9 " + selectedAddOn5P);
        } else {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
            System.out.println(selectedAddOn4 + " -> \u20b9 " + selectedAddOn4P);
            System.out.println(selectedAddOn5 + " -> \u20b9 " + selectedAddOn5P);
            System.out.println(selectedAddOn6 + " -> \u20b9 " + selectedAddOn6P);
        }

        System.out.println();
        System.out.println("Your total healthy burger price is \u20b9 " + totalPrice);
        System.out.println("Enjoy your meal!!");
        System.out.println("Eat healthy stay healthy!!");
    }

    public String getSelectedAddOn5() {
        return selectedAddOn5;
    }

    public String getSelectedAddOn6() {
        return selectedAddOn6;
    }

    @Override
    public String getBasePrice() {
        return "\u20b9 " + basePrice;
    }
}
