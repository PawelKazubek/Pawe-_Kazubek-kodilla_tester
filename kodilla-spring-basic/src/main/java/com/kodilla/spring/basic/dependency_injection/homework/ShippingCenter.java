package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryServiceInterface deliveryService;
    private NotificationServiceInterface notificationService;
    public ShippingCenter (DeliveryServiceInterface deliveryServiceInterface, NotificationServiceInterface notificationServiceInterface) {
        this.deliveryService = deliveryServiceInterface;
        this.notificationService = notificationServiceInterface;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
