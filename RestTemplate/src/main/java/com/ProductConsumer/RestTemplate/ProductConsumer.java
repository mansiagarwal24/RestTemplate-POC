package com.ProductConsumer.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductConsumer {
    @Autowired
    ProductService productService;
    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }
}
