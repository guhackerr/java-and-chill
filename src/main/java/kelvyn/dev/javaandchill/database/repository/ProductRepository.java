package kelvyn.dev.javaandchill.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvyn.dev.javaandchill.database.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
