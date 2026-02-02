package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController2 {
    private final ProductService2 productService2;

    public ProductsController2(ProductService2 productService2) {
        this.productService2 = productService2;
    }

    @RequestMapping("/products2")
    public String viewProducts(Model model) {
        var products = productService2.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
    @RequestMapping(value = "/products2", method = RequestMethod.POST)
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {
        Product2 p = new Product2();
        p.setName(name);
        p.setPrice(price);
        productService2.addProduct(p);

        var products = productService2.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
