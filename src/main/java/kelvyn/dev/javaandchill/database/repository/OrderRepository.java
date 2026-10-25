package kelvyn.dev.javaandchill.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvyn.dev.javaandchill.database.entity.OrderItem;

public interface OrderRepository extends JpaRepository<OrderItem, Long>{
    
}
