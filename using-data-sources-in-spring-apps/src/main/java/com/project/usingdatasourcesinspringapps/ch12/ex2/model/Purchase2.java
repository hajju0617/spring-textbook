package com.project.usingdatasourcesinspringapps.ch12.ex2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Purchase2 {

    private int id;
    private String product;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Purchase2 purchase2 = (Purchase2) object;
        return id == purchase2.id && Objects.equals(product, purchase2.product) && Objects.equals(price, purchase2.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price);
    }
}
