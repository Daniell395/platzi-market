package com.platzi.platzimarket.domain;

import com.platzi.platzimarket.domain.Category;

public class Product {
    private Integer productId;
    private String name;
    private Double price;
    private Integer stock;
    private Boolean active;
    private Category category;
    private Integer categoryId;

    public Integer getProductId() {
        return productId;
    }

    public Integer getCategoryId() {return categoryId;}

    public void setCategoryId(Integer categoryId) {this.categoryId = categoryId;}

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
