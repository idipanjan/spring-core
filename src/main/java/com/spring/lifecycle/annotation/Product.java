package com.spring.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "price='" + price + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("starting method of Product");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method of Product");
    }
}
