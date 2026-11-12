package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "workout_plans")
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String objective;

    private Long personalTrainerId;

    private Long studentId;

    @OneToMany(mappedBy = "workoutPlan", cascade = CascadeType.ALL)
    private List<WorkoutDay> workoutDays;

    private boolean active = true;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
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

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Long getPersonalTrainerId() {
        return personalTrainerId;
    }

    public void setPersonalTrainerId(Long personalTrainerId) {
        this.personalTrainerId = personalTrainerId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public List<WorkoutDay> getWorkoutDays() {
        return workoutDays;
    }

    public void setWorkoutDays(List<WorkoutDay> workoutDays) {
        this.workoutDays = workoutDays;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return active == that.active && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(objective, that.objective) && Objects.equals(personalTrainerId, that.personalTrainerId) && Objects.equals(studentId, that.studentId) && Objects.equals(workoutDays, that.workoutDays) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, objective, personalTrainerId, studentId, workoutDays, active, createdAt, updatedAt);
    }
}

