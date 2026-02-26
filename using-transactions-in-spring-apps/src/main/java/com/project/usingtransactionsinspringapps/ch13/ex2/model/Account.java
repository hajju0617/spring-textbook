package com.project.usingtransactionsinspringapps.ch13.ex2.model;

import java.math.BigDecimal;

public class Account {
    private long id;
    private String name;
    private BigDecimal amount;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
