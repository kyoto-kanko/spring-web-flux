package com.example.springwebflux.service;

import com.example.springwebflux.model.Order;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class KitchenService {

    // TODO FLUXも追加する
    public Mono<Order> prepareDish(Order order) {
        return Mono.just(order)
                .delayElement(Duration.ofSeconds(5))
                .doOnNext(o -> System.out.println("Preparing dish for " + o.getCustomerName()));
    }
}
