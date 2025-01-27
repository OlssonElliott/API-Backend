package com.api_backend.api_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api_backend.api_backend.model.Meal;
import com.api_backend.api_backend.service.MealService;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MealController {

    MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/meals")
    public Iterable<Meal> showAllMeals() {
        return mealService.showAllMeals();
    }

    @GetMapping("/find-meal")
    public Optional<Meal> findMeal(@RequestParam int id) {
        return mealService.findMeal(id);
    }

    @PostMapping("/add-meal")
    public String addMeal(@RequestBody Meal meal) {
        mealService.addMeal(meal);
        return "Meal med id: " + meal.getId() + " added";
    }

    @DeleteMapping("/delete-meal")
    public String deleteMeal(@RequestParam Integer id) {
        mealService.deleteMeal(id);
        return "Meal med id: " + id + " borttagen";
    }

}
