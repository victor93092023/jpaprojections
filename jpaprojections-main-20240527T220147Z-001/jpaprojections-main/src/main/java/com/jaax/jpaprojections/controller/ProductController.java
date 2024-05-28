package com.jaax.jpaprojections.controller;

import com.jaax.jpaprojections.entity.Product;
import com.jaax.jpaprojections.projection.classbased.ProductDTO;
import com.jaax.jpaprojections.projection.interfacebased.closed.ProductClosedView;
import com.jaax.jpaprojections.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    // Closed View Interface Based
    @GetMapping("/findAllProductsClosedView")
    public List<ProductClosedView> findAllProductsClosedView(){
        return productService.findBy();
    }

    @GetMapping("/findProductById/{idProduct}")
    public Optional<ProductClosedView> findProductById(@PathVariable Long idProduct){
        return productService.findProductById(idProduct);
    }

    // Class View Based
    @GetMapping("/findProductClassBased")
    public List<ProductDTO> findProductClassBased(){
        return productService.findProductsBy();
    }

    //Dynamic
    @GetMapping("/findProductByBrandDynamicClosedView/{brand}")
    public ProductClosedView findProductByBrandDynamicClosedView(@PathVariable(name = "brand") String brand){
        return productService.findByBrandDynamicClosedView(brand);
    }

    @GetMapping("/findProductByBrandDynamicClassBased/{brand}")
    public ProductDTO findProductByBrandDynamicClassBased(@PathVariable(name = "brand") String brand){
        return productService.findByBrandDynamicClassBased(brand);
    }



}
