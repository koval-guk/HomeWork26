package org.example.service;

import org.example.model.Order;
import org.example.model.Product;
import org.example.repo.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoClassService implements OrderService {
    private final OrderRepository orderRepository = new OrderRepository();

    @Override
    public Order getOrderById(int id) {
        return orderRepository.getOrders().stream().filter(order -> order.getId() == id).findFirst().get();
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getOrders();
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.add(order);
    }

    @Override
    public void addSingleProductOrder(String name, double cost) {
        Product product = new Product(name, cost);
        List<Product> singleProductList = new ArrayList<>();
        singleProductList.add(product);
        Order newOrder = new Order(singleProductList);
        addOrder(newOrder);
    }

}
