package com.telerikacademy.oop.composition;

public class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getInfo() {
        return String.format("Address: %s street %d", street, number);
    }
}
