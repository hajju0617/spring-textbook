package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController3 {
    private final ProductService3 productService3;

    public ProductsController3(ProductService3 productService3) {
        this.productService3 = productService3;
    }

    @GetMapping("/products3")
    public String viewProducts(Model model) {
        var products = productService3.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
    @PostMapping("/products3")
    public String addProduct(// @RequestParam String name, @RequestParam double price,
                             Product3 product3,
                             Model model) {
//        Product3 p = new Product3();
//        p.setName(name);
//        p.setPrice(price);
        productService3.addProduct(product3);

        var products = productService3.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
