package org.example.model;

public class Product {
    private final int id;
    private final String name;
    private final double cost;
    private static int idCount;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.id = ++idCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

}
