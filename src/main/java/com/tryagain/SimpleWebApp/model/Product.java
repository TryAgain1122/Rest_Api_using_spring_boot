package com.tryagain.SimpleWebApp.model;

import org.springframework.stereotype.Component;


@Component
public class Product {

    private int productId;
    private String productName;
    private int price;

    //New Items
    public Product () {

    }

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return  productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }
}
