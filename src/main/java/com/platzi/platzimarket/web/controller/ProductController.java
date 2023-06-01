package com.platzi.platzimarket.web.controller;

import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.domain.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping()
    @Operation(summary = "Get all supermarket products")
    @ApiResponse(responseCode = "200",description = "OK")
    @ApiResponse(responseCode = "204",description = "Products not loaded")
    public ResponseEntity<List<Product>> getAll(){
        try{
            return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
        }catch (RuntimeException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @GetMapping("/{id}")
    @Operation(summary = "Search a product with an ID")
    @ApiResponse(responseCode = "200",description = "OK")
    @ApiResponse(responseCode = "400",description = "Product not found")

    public ResponseEntity<Product> getProduct
            (@Parameter(description ="the id of the product",required = true,example = "7")
             @PathVariable("id") int productId)
        {
            return productService.getProduct(productId).map(product -> new ResponseEntity<>(product, HttpStatus.OK)).
                    orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));}
    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>>getByCategory(@PathVariable("id") int categoryId){
        return productService.getByCategory(categoryId).map(products -> new ResponseEntity<>(products,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping()
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product),HttpStatus.CREATED) ;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int productId){
        return new ResponseEntity(productService.delete(productId)? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}

