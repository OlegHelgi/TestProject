package ru;

/**
 * Created by Олег on 01.12.2015.
 */
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark(Dog other) {
        // comments
        System.out.println("Hello, "+ other.name+" My name is "+name);
    }
}
