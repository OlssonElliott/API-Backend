package com.api_backend.api_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api_backend.api_backend.model.Meal;
import com.api_backend.api_backend.service.MealService;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController

// Fick använda @CrossOrigin för kunde inte nå 8080 pga CORS i frontend, källa:
// https://spring.io/guides/gs/rest-service-cors
@CrossOrigin(origins = "http://localhost:8081")
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
    public Optional<Meal> findMeal(@RequestParam Integer id) {
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

    @PutMapping("/favorite")
    public String setFavorite(@RequestParam Integer id) {
        boolean svar = mealService.setFavorite(id);
        if (svar == true) {
            return "meal id: " + id + " is a favorite!";
        } else {
            return "meal id: " + id + " is not a favorite";
        }
    }

    @PutMapping("/comment")
    public String setComment(@RequestParam Integer id, @RequestParam String comment) {
        return mealService.setComment(id, comment);
    }

}
