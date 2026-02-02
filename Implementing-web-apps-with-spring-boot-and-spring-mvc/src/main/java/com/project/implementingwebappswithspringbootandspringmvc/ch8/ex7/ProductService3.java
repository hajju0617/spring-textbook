package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex7;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService3 {
    private List<Product3> product3s = new ArrayList<>();

    public void addProduct(Product3 product3) {
        product3s.add(product3);
    }

    public List<Product3> findAll() {
        return product3s;
    }
}
