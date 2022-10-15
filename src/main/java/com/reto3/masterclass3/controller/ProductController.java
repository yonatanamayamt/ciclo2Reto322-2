package com.reto3.masterclass3.controller;

import com.reto3.masterclass3.entities.Product;
import com.reto3.masterclass3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Product")
public class ProductController{
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
@PostMapping("/save")
    public Product save(@RequestBody Product p){
        return productService.save(p);
}
}
