package com.tryagain.SimpleWebApp.service;

import com.tryagain.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    //List of Products
    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Camera", 7000),
            new Product(103, "Samsung", 70000)
    );

    public List<Product> getProducts() {
        return  products;
    }
}
