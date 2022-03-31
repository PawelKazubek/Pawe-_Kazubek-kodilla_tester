package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrdersFromDates(LocalDate date1, LocalDate date2) {
        List<Order> ordersDate = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().isAfter(date1) && order.getDate().isBefore(date2))
                ordersDate.add(order);
        }
            return ordersDate;
    }
    public List<Order> getOrderBetweenValues(double value1, double value2) {
        List<Order> ordersValue = new ArrayList<>();
        for (Order order : orders) {
            if (value1 <= order.getValue() && value2 >= order.getValue())
                ordersValue.add(order);
        }
        return ordersValue;
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
