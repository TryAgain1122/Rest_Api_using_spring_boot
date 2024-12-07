package com.tryagain.SimpleWebApp.controller;

import com.tryagain.SimpleWebApp.model.Product;
import com.tryagain.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts () {
        return service.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById (@PathVariable int productId) {
        return service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct (@RequestBody Product product) {
        service.addProduct(product);
    }


}
