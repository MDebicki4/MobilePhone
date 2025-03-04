package com.company;

public class Contacts {
    private final String name;
    private final String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }
}
