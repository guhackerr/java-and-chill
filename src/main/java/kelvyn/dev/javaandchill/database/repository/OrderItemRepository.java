package kelvyn.dev.javaandchill.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvyn.dev.javaandchill.database.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
