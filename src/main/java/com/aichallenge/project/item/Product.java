package com.aichallenge.project.item;

public class Product {
    private static int inc = 1;
    private final int id;
    private final String name;
    private final int mass;

    public Product(String name, int mass) {
        this.id = inc++;
        this.name = name;
        this.mass = mass;
    }

    public Product(int mass) {
        this("", mass);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }
}
