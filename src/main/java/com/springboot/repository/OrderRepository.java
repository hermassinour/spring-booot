package com.springboot.repository;

import com.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByNdcOrderId(String ndcOrderId);
}
