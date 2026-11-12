package br.com.murilohenriquedev.trainer.entity;


import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "workout_session_exercises")
public class WorkoutSessionExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long workoutSessionId;

    private Long exerciseId;

    private Integer setsPerformed;

    @ElementCollection
    private List<Integer> repsPerformed;

    @ElementCollection
    private List<Double> weightUsed;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "workout_session_id", insertable = false, updatable = false)
    private WorkoutSession workoutSession;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkoutSessionId() {
        return workoutSessionId;
    }

    public void setWorkoutSessionId(Long workoutSessionId) {
        this.workoutSessionId = workoutSessionId;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getSetsPerformed() {
        return setsPerformed;
    }

    public void setSetsPerformed(Integer setsPerformed) {
        this.setsPerformed = setsPerformed;
    }

    public List<Integer> getRepsPerformed() {
        return repsPerformed;
    }

    public void setRepsPerformed(List<Integer> repsPerformed) {
        this.repsPerformed = repsPerformed;
    }

    public List<Double> getWeightUsed() {
        return weightUsed;
    }

    public void setWeightUsed(List<Double> weightUsed) {
        this.weightUsed = weightUsed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public WorkoutSession getWorkoutSession() {
        return workoutSession;
    }

    public void setWorkoutSession(WorkoutSession workoutSession) {
        this.workoutSession = workoutSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutSessionExercise that = (WorkoutSessionExercise) o;
        return Objects.equals(id, that.id) && Objects.equals(workoutSessionId, that.workoutSessionId) && Objects.equals(exerciseId, that.exerciseId) && Objects.equals(setsPerformed, that.setsPerformed) && Objects.equals(repsPerformed, that.repsPerformed) && Objects.equals(weightUsed, that.weightUsed) && Objects.equals(notes, that.notes) && Objects.equals(workoutSession, that.workoutSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workoutSessionId, exerciseId, setsPerformed, repsPerformed, weightUsed, notes, workoutSession);
    }
}

