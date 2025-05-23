package com.neel.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// spring application --
		// SpringApplication.run(StoreApplication.class, args);

		// console application --
		// var orderService = new OrderService(new StripePaymentService());
		// var orderService = new OrderService(new PaypalPaymentService());

		//setter
		var orderService = new OrderService();
		orderService.setPaymentService(new PaypalPaymentService());
		orderService.placeOrder();

	}

}
