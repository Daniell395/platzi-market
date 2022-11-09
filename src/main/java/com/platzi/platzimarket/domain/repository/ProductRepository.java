package com.platzi.platzimarket.domain.repository;

import com.platzi.platzimarket.domain.service.Product;
import com.platzi.platzimarket.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product>getAll();
    Optional<List<Product>>getByCategory(int categoryId);
    Optional<List<Product>>getLimitedProducts(int quantity);
    Optional<Product>getProduct(int productId);
    Producto save(Product product);
    void delete(int productId);
}
