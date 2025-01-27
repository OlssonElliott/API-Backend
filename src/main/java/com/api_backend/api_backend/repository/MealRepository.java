package com.api_backend.api_backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.api_backend.api_backend.model.Meal;

public interface MealRepository extends CrudRepository<Meal, Integer> {

}
