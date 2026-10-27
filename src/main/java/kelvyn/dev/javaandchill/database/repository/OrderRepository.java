package kelvyn.dev.javaandchill.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvyn.dev.javaandchill.database.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
