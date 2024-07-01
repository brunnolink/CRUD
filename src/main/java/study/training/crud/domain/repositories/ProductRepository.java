package study.training.crud.domain.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import study.training.crud.domain.product.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findAllByActiveTrue();
}
