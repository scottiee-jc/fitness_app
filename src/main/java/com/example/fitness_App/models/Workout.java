package com.example.fitness_App.models;

import javax.persistence.*;

@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "exercises")
    private Exercise exercise;

    public Workout() {
    }

    public Workout(Long id, Exercise exercise) {
        this.id = id;
        this.exercise = exercise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
