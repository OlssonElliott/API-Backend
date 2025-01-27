package com.api_backend.api_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api_backend.api_backend.model.Meal;
import com.api_backend.api_backend.service.MealService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MealController {

    MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/meals")
    public void showMeals() {
    }

    @PostMapping("/add-meal")
    public void addMeal(@RequestBody Meal meal) {
        mealService.addMeal();
    }

}
