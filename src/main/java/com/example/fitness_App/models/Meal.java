package com.example.fitness_App.models;


import com.example.fitness_App.models.enums.Allergies;
import com.example.fitness_App.models.enums.DietaryPreference;

import javax.persistence.*;

public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meal_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "ingredients")
    private Ingredient ingredient;

    @Column(name = "diet_friendly")
    private DietaryPreference dietaryPreference;

    @Column(name = "allergens")
    private Allergies allergies;

    private int calories;

    public Meal(Long id, String name, Ingredient ingredient, DietaryPreference dietaryPreference, Allergies allergies, int calories) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
        this.dietaryPreference = dietaryPreference;
        this.allergies = allergies;
        this.calories = calories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public DietaryPreference getDietaryPreference() {
        return dietaryPreference;
    }

    public void setDietaryPreference(DietaryPreference dietaryPreference) {
        this.dietaryPreference = dietaryPreference;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
