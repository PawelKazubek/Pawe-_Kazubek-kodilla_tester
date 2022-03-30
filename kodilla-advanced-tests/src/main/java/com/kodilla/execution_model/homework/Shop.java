package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public Order getOrdersFromDates(LocalDate date1, LocalDate date2) {
        for (Order order : orders) {

            return order;
        }
    }

    public int getQuantity() {
        return this.orders.size();
    }
    public double getValuesOfOrders() {
        double sum = 0;
        for (Order order : orders) {
            sum+=order.getValue();
        }
        return sum;
    }
}
