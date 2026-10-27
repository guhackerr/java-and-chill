package kelvyn.dev.javaandchill.database.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter @Setter 
@NoArgsConstructor @AllArgsConstructor
public class Order{

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDate orderDate;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderItem> items = new ArrayList<>();


    @PrePersist
    public void PrePersist(){
        if(this.orderDate == null){
            this.orderDate = LocalDate.now();
        }
    }

    public BigDecimal totalPrice(){
        return items.stream().map(item -> item.getUnityPrice().multiply(BigDecimal.valueOf(item.getQuantity()))).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
