package com.Anurag;

public class DoubleConstructorClass {
    DoubleConstructorClass() {
        this("Called");
        System.out.println("Constructor without parameters");
    }

    DoubleConstructorClass(String name) {
        System.out.println("Overloaded Constructor with string: " + name);
    }
}
