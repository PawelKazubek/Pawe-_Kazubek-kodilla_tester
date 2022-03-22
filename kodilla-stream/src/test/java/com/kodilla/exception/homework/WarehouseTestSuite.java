package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseTestSuite {
    @Test
    public void shouldFindOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order nr 2"));

        Order result = warehouse.getOrder("Order nr 2");
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldFindNotExistingOrder() {
        Warehouse warehouse = new Warehouse();
        Assertions.assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Order nr 6"));

    }
}
