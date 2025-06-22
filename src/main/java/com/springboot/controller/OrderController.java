package com.springboot.controller;

import com.springboot.model.Order;
import com.springboot.repository.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springboot.repository.OrderRepository;
import com.springboot.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // GET all orders (admin use)
    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/by-ndc/{ndcOrderId}")
    public ResponseEntity<?> getOrderByNdcOrderId(@PathVariable String ndcOrderId) {
        Optional<Order> orderOpt = orderRepository.findByNdcOrderId(ndcOrderId);
        return orderOpt
                .map(order -> ResponseEntity.ok(order))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
