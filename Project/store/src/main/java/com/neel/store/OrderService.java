package com.neel.store;

public class OrderService {

    private  PaymentService paymentService;

    // correct way to inject dependency is via constructor --
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        // here dependency injection is not used --
        // here order class is dependent on stripe payment service
        /*
        var paymentService = new StripePaymentService();
        paymentService.processPayment(1000);
         */

        // after refactoring code becomes --
        paymentService.processPayment(1000);
    }
}
