package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "workout_exercises")
public class WorkoutExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer setsCount;

    private String reps;

    private String weight;

    private Integer exerciseOrder;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "workout_day_id")
    private WorkoutDay workoutDay;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSetsCount() {
        return setsCount;
    }

    public void setSetsCount(Integer setsCount) {
        this.setsCount = setsCount;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getExerciseOrder() {
        return exerciseOrder;
    }

    public void setExerciseOrder(Integer exerciseOrder) {
        this.exerciseOrder = exerciseOrder;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public WorkoutDay getWorkoutDay() {
        return workoutDay;
    }

    public void setWorkoutDay(WorkoutDay workoutDay) {
        this.workoutDay = workoutDay;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutExercise that = (WorkoutExercise) o;
        return Objects.equals(id, that.id) && Objects.equals(setsCount, that.setsCount) && Objects.equals(reps, that.reps) && Objects.equals(weight, that.weight) && Objects.equals(exerciseOrder, that.exerciseOrder) && Objects.equals(notes, that.notes) && Objects.equals(workoutDay, that.workoutDay) && Objects.equals(exercise, that.exercise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, setsCount, reps, weight, exerciseOrder, notes, workoutDay, exercise);
    }
}

