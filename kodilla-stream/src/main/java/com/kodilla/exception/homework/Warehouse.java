package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = getOrders()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
        return order;

    }
    public String isOrderInUse(String number) throws OrderDoesntExistException {
        if (getOrder(number).equals(number))
        return getOrder(number).toString();
        throw new OrderDoesntExistException();
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public String getNumber(Order order) {
        return order.getNumber();
    }

}