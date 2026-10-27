package kelvyn.dev.javaandchill.service;

import org.springframework.stereotype.Service;

import kelvyn.dev.javaandchill.database.model.Order;
import kelvyn.dev.javaandchill.database.repository.OrderRepository;
import kelvyn.dev.javaandchill.exception.NotFoundException;
import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class OrderService {

    private final OrderRepository orderRepository;

    public Order orderCreate(Order order){
        return orderRepository.save(order);
    }

    public Order orderFind(Long id) throws NotFoundException{
        return orderRepository.findById(id).orElseThrow( () -> new NotFoundException("Não foi possivel encontrar"));
    }
}
