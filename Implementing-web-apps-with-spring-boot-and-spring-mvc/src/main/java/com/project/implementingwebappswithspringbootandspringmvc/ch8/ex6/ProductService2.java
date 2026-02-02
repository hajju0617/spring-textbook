package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService2 {
    private List<Product2> product2s = new ArrayList<>();

    public void addProduct(Product2 product2) {
        product2s.add(product2);
    }

    public List<Product2> findAll() {
        return product2s;
    }
}
