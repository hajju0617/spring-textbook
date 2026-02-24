package com.project.usingdatasourcesinspringapps.ch12.ex3.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Purchase3 {

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
        Purchase3 purchase3 = (Purchase3) object;
        return id == purchase3.id && Objects.equals(product, purchase3.product) && Objects.equals(price, purchase3.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price);
    }
}
