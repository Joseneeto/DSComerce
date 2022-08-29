package com.joseneto.dscommerce.controllers;

import com.joseneto.dscommerce.entities.Product;
import com.joseneto.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    private String teste (){
        Optional<Product> result =  repository.findById(1L);
        Product product = result.get();
        return product.getName();
    }
}
