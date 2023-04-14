package org.example.repo;

import org.example.model.Order;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        Product cat1 = new Product("cat1", 100);
        Product cat2 = new Product("cat2", 200);
        Product cat3 = new Product("cat3", 300);
        Product cat4 = new Product("cat4", 400);
        List<Product> p1 = new ArrayList<>();
        List<Product> p2 = new ArrayList<>();
        p1.add(cat1);
        p1.add(cat2);
        p2.add(cat3);
        p2.add(cat4);
        Order order1 = new Order(p1);
        Order order2 = new Order(p2);
        orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
    }

    public void add(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
