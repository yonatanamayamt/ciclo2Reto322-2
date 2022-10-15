package com.reto3.masterclass3.controller;

import com.reto3.masterclass3.entities.Category;
import com.reto3.masterclass3.entities.Product;
import com.reto3.masterclass3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
@PostMapping("/save")
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
}
}
