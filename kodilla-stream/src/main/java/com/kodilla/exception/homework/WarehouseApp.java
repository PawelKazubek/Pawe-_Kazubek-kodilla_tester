package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order nr 1"));
        warehouse.addOrder(new Order("Order nr 2"));
        warehouse.addOrder(new Order("Order nr 3"));
        warehouse.addOrder(new Order("Order nr 4"));
        warehouse.addOrder(new Order("Order nr 5"));

        try { String orderNumber = "Order nr 6";
            warehouse.getOrder(orderNumber);
            System.out.println("Found order with nr: " + orderNumber);
        } catch (OrderDoesntExistException e) {
            System.out.println("Such order doesn't exist. Please try another number.");
        } finally {
            System.out.println("You have got your order. Please check another one.");
        }
    }
}
