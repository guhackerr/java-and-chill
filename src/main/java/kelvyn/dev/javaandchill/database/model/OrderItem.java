package kelvyn.dev.javaandchill.database.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kelvyn.dev.javaandchill.enums.Category;
import lombok.*;

@Entity 
@Table(name = "order_itens") 
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class OrderItem {

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private BigDecimal unityPrice;
    private Integer quantity;
    private Category category;

}
