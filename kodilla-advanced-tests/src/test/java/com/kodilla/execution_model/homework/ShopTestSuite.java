package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order TVSet = new Order(5500, LocalDate.of(2022, 1, 15),"Kmicic");
    Order LegoSet = new Order(564,LocalDate.of(2021,11,2), "Pustelnik");
    Order MacBookPro = new Order(14700, LocalDate.of(2021, 6, 18), "Neo1999");
    Order PlayStation5 = new Order(2999, LocalDate.of(2021, 10, 25), "SpeedyJoe");
    Order IPhone13 = new Order(5999, LocalDate.of(2022, 2, 22), "Anonymus");

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(TVSet);
        shop.addOrder(LegoSet);
        shop.addOrder(MacBookPro);
        shop.addOrder(PlayStation5);
        shop.addOrder(IPhone13);
    }
    @Test
    public void shouldAddOrder() {
        int numberOfOrders = shop.getQuantity();
        assertEquals(5,numberOfOrders);
    }
    @Test
    public void shouldGetExistingOrderFromBetweenDates() {
        List result = shop.getOrdersFromDates(LocalDate.of (2021,3, 31),LocalDate.of(2022,05, 30));
        List<Order> expected = new ArrayList<>();
        expected.add(IPhone13);
        assertEquals(expected, result);

    }
    @Test
    public void shouldGetExistingOrderWithValue() {
        List result = shop.getOrderBetweenValues(5000, 5600);
        List<Order> TVSet = new ArrayList<>();
        assertEquals(TVSet, result);

    }
}
