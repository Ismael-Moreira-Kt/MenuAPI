package com.example.menu.repositories;

import com.example.menu.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FoodRepository extends JpaRepository<FoodEntity, Long> { }