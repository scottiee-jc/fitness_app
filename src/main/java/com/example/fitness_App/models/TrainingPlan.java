package com.example.fitness_App.models;


import javax.persistence.*;

@Entity
public class TrainingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "application_user_id")
    private ApplicationUser applicationUser;

    @OneToMany
    @JoinColumn(name = "workout")
    private Workout workout;

    @Column(name = "day")
    private int Day;
    @Column(name = "week")
    private int Week;
    @Column(name = "month")
    private int Month;

    public TrainingPlan() {
    }

    public TrainingPlan(Long id, ApplicationUser applicationUser, Workout workout, int day, int week, int month) {
        this.id = id;
        this.applicationUser = applicationUser;
        this.workout = workout;
        Day = day;
        Week = week;
        Month = month;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getWeek() {
        return Week;
    }

    public void setWeek(int week) {
        Week = week;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }
}
