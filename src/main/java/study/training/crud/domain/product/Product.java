package study.training.crud.domain.product;


import jakarta.persistence.*;
import lombok.*;
import study.training.crud.domain.repositories.RequestProduct;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String id;

    private String name;

    private Integer price_in_cents;

    private  boolean active;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;
    }
}
