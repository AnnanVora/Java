package com.annan.section8.ArrayListChallenge;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone phone = new MobilePhone(); // To change name use refactor

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addContact(phone);
                    break;
                case 3:
                    modifyContact(phone);
                    break;
                case 4:
                    removeContact(phone);
                    break;
                case 5:
                    searchForContact(phone);
                    break;
                case 6:
                    quit = true;
                    System.out.println("Thank you for using our service!");
                    break;
            }
        }
    }

    public static void addContact(MobilePhone phone) {

        System.out.println("Welcome to the Add Contact Wizard");
        System.out.println("Enter the contact name.");
        String name = scanner.nextLine();
        System.out.println("Enter the contact number.");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        phone.addContact(contact);

    }

    public static void modifyContact(MobilePhone phone) {

        System.out.println("Welcome to the Modify Contact Wizard");
        System.out.println("Enter the name of the contact you wish to modify.");
        String oldName = scanner.nextLine();
        if (phone.onList(oldName)) {
            System.out.println("Enter the modified contact name.");
            String newName = scanner.nextLine();
            System.out.println("Enter the modified contact number.");
            String newNumber = scanner.nextLine();
            Contact newContact = new Contact(newName, newNumber);
            phone.modifyContact(oldName, newContact);
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void removeContact(MobilePhone phone) {

        System.out.println("Welcome to the Delete Contact Wizard");
        System.out.println("Enter the name of the item you wish to remove.");
        String name = scanner.nextLine();
        if (phone.onList(name)) {
            phone.removeContact(name);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void searchForContact(MobilePhone phone) {

        System.out.println("Welcome to the Search Contact Wizard");
        System.out.println("Enter name of contact to find.");
        String name = scanner.nextLine();
        if (phone.onList(name)) {
            System.out.println("Contact found");
            System.out.println("\tName: " + phone.findContact(name).getName());
            System.out.println("\tContact number: " + phone.findContact(name).getPhoneNumber());
        } else {
            System.out.println("Contact does not exist.");
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
}
