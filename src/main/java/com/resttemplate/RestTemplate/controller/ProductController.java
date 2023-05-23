package com.resttemplate.RestTemplate.controller;

import com.resttemplate.RestTemplate.entity.Product;
import com.resttemplate.RestTemplate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-api")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
