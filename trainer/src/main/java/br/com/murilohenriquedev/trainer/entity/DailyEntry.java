package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "daily_entries")
public class DailyEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private LocalDate date;

    private Double weight;

    private Integer mood;

    private Integer energy;

    private Boolean workoutCompleted;

    private String notes;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Boolean getWorkoutCompleted() {
        return workoutCompleted;
    }

    public void setWorkoutCompleted(Boolean workoutCompleted) {
        this.workoutCompleted = workoutCompleted;
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
        DailyEntry that = (DailyEntry) o;
        return Objects.equals(id, that.id) && Objects.equals(studentId, that.studentId) && Objects.equals(date, that.date) && Objects.equals(weight, that.weight) && Objects.equals(mood, that.mood) && Objects.equals(energy, that.energy) && Objects.equals(workoutCompleted, that.workoutCompleted) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, date, weight, mood, energy, workoutCompleted, notes);
    }
}
