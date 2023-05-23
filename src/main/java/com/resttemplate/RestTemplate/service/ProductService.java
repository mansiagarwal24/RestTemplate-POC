package com.resttemplate.RestTemplate.service;

import com.resttemplate.RestTemplate.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {
    private RestTemplate restTemplate;

    @Autowired
    public ProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String createProduct(Product product){
        product.setId(product.getId());
        product.setName(product.getName());
        return "Product Added Successfully!!";
    }

}
