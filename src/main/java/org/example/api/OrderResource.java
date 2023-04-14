package org.example.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.model.Order;
import org.example.service.OrderService;

import java.util.List;

@Path("orders")
public class OrderResource {
    @Inject
    private OrderService orderService;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Order getOrderById(@PathParam("id") int id) {
        return orderService.getOrderById(id);
    }

    @POST //test method
    @Path("/add@{name}:{cost}")
    public String addSingleProductOrder(@PathParam("name") String name, @PathParam("cost") double cost) {
        orderService.addSingleProductOrder(name, cost);
        return "success";
    }
}
