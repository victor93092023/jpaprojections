package com.jaax.jpaprojections.service;

import com.jaax.jpaprojections.entity.Product;
import com.jaax.jpaprojections.projection.classbased.ProductDTO;
import com.jaax.jpaprojections.projection.interfacebased.closed.ProductClosedView;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    List<ProductClosedView> findBy();

    Optional<ProductClosedView> findProductById(Long id);

    List<ProductDTO> findProductsBy();

    ProductClosedView findByBrandDynamicClosedView(String brand);

    ProductDTO findByBrandDynamicClassBased(String brand);

}
