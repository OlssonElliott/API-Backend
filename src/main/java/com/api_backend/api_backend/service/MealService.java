package com.api_backend.api_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api_backend.api_backend.model.Meal;
import com.api_backend.api_backend.repository.MealRepository;

@Service
public class MealService {

    MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public Iterable<Meal> showAllMeals() {
        return mealRepository.findAll();
    }

    public void addMeal(Meal meal) {
        mealRepository.save(meal);
    }

    public Optional<Meal> findMeal(int id) {
        return mealRepository.findById(id);
    }

    public Optional<Meal> deleteMeal(Integer id) {
        Optional<Meal> meal = findMeal(id);
        mealRepository.deleteById(id);
        return meal;
    }

    public boolean setFavorite(Integer id) {
        Optional<Meal> optMeal = mealRepository.findById(id);
        Meal meal = optMeal.get();
        if (meal.isFavorite() == true) {
            meal.setFavorite(false);
        } else {
            meal.setFavorite(true);
        }
        mealRepository.save(meal);
        return meal.isFavorite();
    }

}
