package kelvyn.dev.javaandchill.dto.OrderDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kelvyn.dev.javaandchill.database.model.OrderItem;
import lombok.*;

@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {

    private LocalDate orderDate;
    private List<OrderItem> items = new ArrayList<>();

}
