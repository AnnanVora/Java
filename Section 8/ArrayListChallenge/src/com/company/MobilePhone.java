package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contact(s) saved in your mobile phone");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).getName() + " - " + contacts.get(i).getPhoneNumber());
        }
    }

    public void modifyContact(String contactName, Contact updatedContact) {

        int position = findContactIndex(contactName);
        if (position >= 0) {
            modifyContact(position, updatedContact);
        }
    }

    private void modifyContact(int position, Contact newItem) {

        contacts.set(position, newItem);
        System.out.println("Contact " + (position + 1) + " has been modified");
    }

    public void removeContact(String name) {
        int position = findContactIndex(name);
        if (position >= 0) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        Contact theItem = contacts.get(position);
        contacts.remove(position);
    }

    public int findContactIndex(String name) {

        for (int i = 0; i < contacts.size(); i++) {

            if (name.equals(contacts.get(i).getName())) {
                return i;
            }
        }

        return -1;
    }

    public Contact findContact(String name) {

        if (onList(name)) {
            for (int i = 0; i < contacts.size(); i++) {
                if (name.equals(contacts.get(i).getName())) {
                    return contacts.get(i);
                }
            }
        }
        return null;
    }

    public boolean onList(String name) {
        int position = findContactIndex(name);
        return position >= 0;
    }
}
