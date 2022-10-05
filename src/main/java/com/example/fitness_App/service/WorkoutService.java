package com.example.fitness_App.service;

import com.example.fitness_App.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;



}
