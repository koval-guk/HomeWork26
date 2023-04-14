package org.example.model;

import java.util.Date;
import java.util.List;

public class Order {
    private final int id;
    private final Date date;
    private final double cost;
    private final List<Product> products;
    private static int idCount;

    public Order(List<Product> products) {
        this.products = products;
        this.id = ++idCount;
        this.date = new Date();
        this.cost = products.stream().mapToDouble(Product::getCost).sum();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static void setIdCount(int idCount) {
        Order.idCount = idCount;
    }
}
