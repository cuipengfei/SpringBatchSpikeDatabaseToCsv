package com.spike.springbatch.databasetocsv.model;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private String name;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
