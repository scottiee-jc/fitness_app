package com.example.fitness_App.models;

import com.example.fitness_App.models.enums.Allergies;
import com.example.fitness_App.models.enums.DietaryPreference;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)                 //generates persistence primary key using a database identity column for use in SQL server
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private int dob;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "allergens")
    private Allergies allergies;

    @Column(name = "diet")
    private DietaryPreference dietaryPreference;

    @OneToMany(mappedBy = "applicationUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private TrainingPlan trainingPlan;

    public ApplicationUser() {
    }

    public ApplicationUser(Long id, String name, int dob, String username, String password, Allergies allergies, DietaryPreference dietaryPreference, TrainingPlan trainingPlan) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.username = username;
        this.password = password;
        this.allergies = allergies;
        this.dietaryPreference = dietaryPreference;
        this.trainingPlan = trainingPlan;
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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public DietaryPreference getDietaryPreference() {
        return dietaryPreference;
    }

    public void setDietaryPreference(DietaryPreference dietaryPreference) {
        this.dietaryPreference = dietaryPreference;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
}
