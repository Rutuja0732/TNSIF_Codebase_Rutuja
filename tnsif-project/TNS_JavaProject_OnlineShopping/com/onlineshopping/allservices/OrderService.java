package com.onlineshopping.allservices;

import java.util.*;

import com.onlineshopping.entities.Order;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        for (Order o : orders) {
            if (o.getOrderId() == id)
                return o;
        }
        return null;
    }
}
