package com.resttemplate.RestTemplate.service;

import com.resttemplate.RestTemplate.entity.Product;
import com.resttemplate.RestTemplate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    private RestTemplate restTemplate;

    @Autowired
    public ProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String createProduct(Product product){
        Product product1 = new Product();
        product1.setName(product.getName());
        product1.setId(product.getId());
        product1.setBrand(product.getBrand());
        product1.setPrice(product.getPrice());
        productRepository.save(product1);
        return "Product Added Successfully!!";
    }

    public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        List<Product> productList  = new ArrayList<>();
        for(Product product :products){
            productList.add(product);
        }
        return productList;
    }

}
