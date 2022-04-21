package com.kodilla.spring.basic.spring_dependency_injection.homework;

public class ShippingCenter {


    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
