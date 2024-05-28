package com.jaax.jpaprojections.service;

import com.jaax.jpaprojections.entity.Product;
import com.jaax.jpaprojections.projection.classbased.ProductDTO;
import com.jaax.jpaprojections.projection.interfacebased.closed.ProductClosedView;
import com.jaax.jpaprojections.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repository;
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductClosedView> findBy() {
        return repository.findBy();
    }

    @Override
    public Optional<ProductClosedView> findProductById(Long id) {
        return  repository.findProductByIdProduct(id);
    }

    @Override
    public List<ProductDTO> findProductsBy() {
        return repository.findProductBy();
    }

    @Override
    public ProductClosedView findByBrandDynamicClosedView(String brand) {
        ProductClosedView productClosedView = repository.findProductByBrand(brand, ProductClosedView.class);
        return productClosedView;
    }

    @Override
    public ProductDTO findByBrandDynamicClassBased(String brand) {
        ProductDTO productDTO = repository.findProductByBrand(brand, ProductDTO.class);
        return productDTO;
    }

}
