package kelvyn.dev.javaandchill.dto.OrderDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kelvyn.dev.javaandchill.dto.OrderItemDto.OrderItemResponseDto;


public record OrderResponseDto(Long id, LocalDate orderDate, List<OrderItemResponseDto> items){
    public OrderResponseDto{
        if(items == null){
            items = new ArrayList<>();
        }
    }
}