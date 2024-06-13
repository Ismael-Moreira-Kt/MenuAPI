package com.example.menu.controllers;

import com.example.menu.dtos.FoodRequestDTO;
import com.example.menu.dtos.FoodResponseDTO;
import com.example.menu.entities.FoodEntity;
import com.example.menu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("menu")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAllItems() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addItem")
    public void postItem(@RequestBody FoodRequestDTO data) {
        FoodEntity foodData = new FoodEntity(data);
        foodRepository.save(foodData);
    }
}