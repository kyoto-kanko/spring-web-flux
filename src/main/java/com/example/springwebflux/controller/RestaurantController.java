package com.example.springwebflux.controller;

import com.example.springwebflux.model.Order;
import com.example.springwebflux.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RestaurantController {

    private final KitchenService kitchenService;

    @Autowired
    public RestaurantController(KitchenService kitchenService) {
        this.kitchenService = kitchenService;
    }

    @GetMapping("/order")
    public Mono<Order> placeOrder() {
        System.out.println("Placing order...");
        Order order = new Order("Spaghetti", "John Doe");
        return kitchenService.prepareDish(order);
    }
}