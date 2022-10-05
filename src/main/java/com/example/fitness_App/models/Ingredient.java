package com.example.fitness_App.models;



import com.example.fitness_App.models.enums.Allergies;

import javax.persistence.*;

public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column(name = "weight")
    private int weight;
    @Column(name = "quantity")
    private int quantity;
    private Allergies allergies;

    private int calories;
    private double protein;
    private double carbohydrates;
    private double sugars;
    private double fat;
    private double saturates;

    public Ingredient(Long id, String name, int weight, int quantity, Allergies allergies, int calories, double protein, double carbohydrates, double sugars, double fat, double saturates) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.allergies = allergies;
        this.calories = calories;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
        this.fat = fat;
        this.saturates = saturates;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSaturates() {
        return saturates;
    }

    public void setSaturates(double saturates) {
        this.saturates = saturates;
    }
}
