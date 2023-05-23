package com.ProductConsumer.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
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
    public List getAllProducts(){
        return restTemplate.exchange("http://localhost:8081/product-api", HttpMethod.GET,null,List.class).getBody();
    }
}
