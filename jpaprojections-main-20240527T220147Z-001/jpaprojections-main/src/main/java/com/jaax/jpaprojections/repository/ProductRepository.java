package com.jaax.jpaprojections.repository;

import com.jaax.jpaprojections.entity.Product;
import com.jaax.jpaprojections.projection.classbased.ProductDTO;
import com.jaax.jpaprojections.projection.interfacebased.closed.ProductClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Closed View Interface Based
    List<ProductClosedView> findBy();
    Optional<ProductClosedView> findProductByIdProduct(Long idProduct);

    // View Class Based
    List<ProductDTO> findProductBy();

    // Dynamic
    <T> T findProductByBrand(String brand, Class<T> type);
}
