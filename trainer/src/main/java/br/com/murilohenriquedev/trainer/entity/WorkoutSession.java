package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "workout_sessions")
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long workoutPlanId;

    private Long workoutDayId;

    private LocalDate sessionDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private Integer durationMinutes;

    private boolean completed;

    @OneToMany(mappedBy = "workoutSession", cascade = CascadeType.ALL)
    private List<WorkoutSessionExercise> exercises;

    private String notes;

    // Getters e setters omitidos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getWorkoutPlanId() {
        return workoutPlanId;
    }

    public void setWorkoutPlanId(Long workoutPlanId) {
        this.workoutPlanId = workoutPlanId;
    }

    public Long getWorkoutDayId() {
        return workoutDayId;
    }

    public void setWorkoutDayId(Long workoutDayId) {
        this.workoutDayId = workoutDayId;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<WorkoutSessionExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<WorkoutSessionExercise> exercises) {
        this.exercises = exercises;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutSession that = (WorkoutSession) o;
        return completed == that.completed && Objects.equals(id, that.id) && Objects.equals(studentId, that.studentId) && Objects.equals(workoutPlanId, that.workoutPlanId) && Objects.equals(workoutDayId, that.workoutDayId) && Objects.equals(sessionDate, that.sessionDate) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(durationMinutes, that.durationMinutes) && Objects.equals(exercises, that.exercises) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, workoutPlanId, workoutDayId, sessionDate, startTime, endTime, durationMinutes, completed, exercises, notes);
    }
}

