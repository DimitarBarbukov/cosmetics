package com.telerikacademy.oop.constructors;

public class Person {
    public String name;

    public Person() {
        this("Anonymous");
    }

    public Person(String personName) {
        name = personName;
    }

    public void sayName() {
        System.out.printf("I’m %s.", name);
    }
}


