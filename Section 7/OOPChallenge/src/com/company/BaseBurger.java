package com.company;

public class BaseBurger {

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
    private String selectedAddOn1;
    private String selectedAddOn2;
    private String selectedAddOn3;
    private String selectedAddOn4;

    private int basePrice = 250;
    private int tomato = 20;
    private int lettuce = 15;
    private int onion = 18;
    private int cheese = 25;
    private int pickle = 15;
    private int carrot = 20;
    private int mustard = 15;
    private int avocado = 25;

    public BaseBurger(String bread, String patty) {
        this.bread = bread;
        this.patty = patty;
    }

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
        System.out.println("\nYou can choose upto 4 add ons");
        System.out.println();

    }

    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3, String selectedAddOn4) {

        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = selectedAddOn4;
    }

    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2, String selectedAddOn3) {

        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = selectedAddOn3;
        this.selectedAddOn4 = "None";
    }

    public void chooseAddOns(String selectedAddOn1, String selectedAddOn2) {

        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = selectedAddOn2;
        this.selectedAddOn3 = "None";
        this.selectedAddOn4 = "None";
    }

    public void chooseAddOns(String selectedAddOn1) {

        this.selectedAddOn1 = selectedAddOn1;
        this.selectedAddOn2 = "None";
        this.selectedAddOn3 = "None";
        this.selectedAddOn4 = "None";
    }

    public void getBill() {

        int totalPrice = 250;
        int selectedAddOn1P = 0;
        int selectedAddOn2P = 0;
        int selectedAddOn3P = 0;
        int selectedAddOn4P = 0;

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
        }

        System.out.println("Your base burger costs \u20b9 250");
        System.out.println("AddOns are as follows: ");

        if (selectedAddOn4.equals("None") && selectedAddOn3.equals("None") && selectedAddOn2.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
        } else if (selectedAddOn4.equals("None") && selectedAddOn3.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
        } else if (selectedAddOn4.equals("None")) {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
        } else {
            System.out.println(selectedAddOn1 + " -> \u20b9 " + selectedAddOn1P);
            System.out.println(selectedAddOn2 + " -> \u20b9 " + selectedAddOn2P);
            System.out.println(selectedAddOn3 + " -> \u20b9 " + selectedAddOn3P);
            System.out.println(selectedAddOn4 + " -> \u20b9 " + selectedAddOn4P);
        }

        System.out.println();
        System.out.println("Your total burger price is \u20b9 " + totalPrice);
        System.out.println("Enjoy your meal!!");

    }

    public String getBread() {
        return bread;
    }

    public String getPatty() {
        return patty;
    }

    public String getSelectedAddOn1() {
        return selectedAddOn1;
    }

    public String getSelectedAddOn2() {
        return selectedAddOn2;
    }

    public String getSelectedAddOn3() {
        return selectedAddOn3;
    }

    public String getSelectedAddOn4() {
        return selectedAddOn4;
    }

    public String getBasePrice() {
        return "\u20b9 " + basePrice;
    }
}
