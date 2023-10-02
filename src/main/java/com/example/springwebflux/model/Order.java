package com.example.springwebflux.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String dish;
    private String customerName;

    public Order(String dish, String customerName) {
        this.dish = dish;
        this.customerName = customerName;
    }
}