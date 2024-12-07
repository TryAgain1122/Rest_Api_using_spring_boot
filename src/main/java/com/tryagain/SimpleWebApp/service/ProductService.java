package com.tryagain.SimpleWebApp.service;

import com.tryagain.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    //List of Products
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Camera", 7000),
            new Product(103, "Samsung", 70000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst().orElse(new Product(100, "Note Item", 0));
    }

    public void addProduct (Product product) {
        products.add(product);
    }
}
