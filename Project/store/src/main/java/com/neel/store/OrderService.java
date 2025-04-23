package com.neel.store;

public class OrderService {
    public void placeOrder(){
        // here dependency injection is not used --
        // here order class is dependent on stripe payment service
        var paymentService = new StripePaymentService();
        paymentService.processPayment(1000);

        // after refactoring code becomes --
    }
}
