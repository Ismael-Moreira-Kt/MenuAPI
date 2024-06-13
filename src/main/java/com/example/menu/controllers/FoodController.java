package com.example.menu.controllers;

import com.example.menu.entities.FoodEntity;
import com.example.menu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("menu")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodEntity> getAllItems() {
        return foodRepository.findAll();
    }
}