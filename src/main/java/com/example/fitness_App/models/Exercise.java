package com.example.fitness_App.models;

import javax.persistence.*;

public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "exercise_name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "media")
    private int media;
    @Column(name = "reps")
    private int reps;
    @Column(name = "sets")
    private int sets;
    @Column(name = "tempo")
    private String tempo;
    @ManyToOne
    private Workout workout;

    public Exercise(Long id, String name, String description, int media, int reps, int sets, String tempo, Workout workout) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.media = media;
        this.reps = reps;
        this.sets = sets;
        this.tempo = tempo;
        this.workout = workout;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
