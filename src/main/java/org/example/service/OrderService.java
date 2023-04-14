package org.example.service;

import org.example.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(int id);

    List<Order> getAllOrders();

    void addOrder(Order order);

    void addSingleProductOrder(String name, double cost);
}
