package com.api_backend.api_backend.service;

import org.springframework.stereotype.Service;

import com.api_backend.api_backend.model.Meal;
import com.api_backend.api_backend.repository.MealRepository;

@Service
public class MealService {

    MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public void addMeal() {
        Meal testmeal = new Meal(1, "source", "comment");
        mealRepository.save(testmeal);
    }

    public void findMeal() {

    }

    public void removeMeal() {

    }

}
