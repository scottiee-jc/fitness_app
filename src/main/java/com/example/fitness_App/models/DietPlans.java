package com.example.fitness_App.models;

import javax.persistence.*;

@Entity
public class DietPlans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "meals")
    private Meal meal;


}
