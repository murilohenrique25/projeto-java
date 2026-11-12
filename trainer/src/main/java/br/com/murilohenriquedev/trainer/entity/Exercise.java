package br.com.murilohenriquedev.trainer.entity;

import br.com.murilohenriquedev.trainer.enums.DifficultyLevel;
import br.com.murilohenriquedev.trainer.enums.EquipmentType;
import br.com.murilohenriquedev.trainer.enums.ExerciseType;
import br.com.murilohenriquedev.trainer.enums.MuscleGroup;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String instructions;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MuscleGroup primaryMuscleGroup;

    @ElementCollection(targetClass = MuscleGroup.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "exercise_secondary_muscles", joinColumns = @JoinColumn(name = "exercise_id"))
    @Column(name = "muscle_group")
    private List<MuscleGroup> secondaryMuscleGroups;

    @Enumerated(EnumType.STRING)
    @Column
    private ExerciseType exerciseType;

    @Enumerated(EnumType.STRING)
    @Column
    private EquipmentType equipmentType;

    @ElementCollection
    @CollectionTable(name = "exercise_photos", joinColumns = @JoinColumn(name = "exercise_id"))
    @Column(name = "photo_url")
    private List<String> photos;

    @ElementCollection
    @CollectionTable(name = "exercise_videos", joinColumns = @JoinColumn(name = "exercise_id"))
    @Column(name = "video_url")
    private List<String> videos;

    @Enumerated(EnumType.STRING)
    @Column
    private DifficultyLevel difficultyLevel;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Construtores
    public Exercise() {}

    public Exercise(String name, MuscleGroup primaryMuscleGroup) {
        this.name = name;
        this.primaryMuscleGroup = primaryMuscleGroup;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public MuscleGroup getPrimaryMuscleGroup() { return primaryMuscleGroup; }
    public void setPrimaryMuscleGroup(MuscleGroup primaryMuscleGroup) { this.primaryMuscleGroup = primaryMuscleGroup; }

    public List<MuscleGroup> getSecondaryMuscleGroups() { return secondaryMuscleGroups; }
    public void setSecondaryMuscleGroups(List<MuscleGroup> secondaryMuscleGroups) { this.secondaryMuscleGroups = secondaryMuscleGroups; }

    public ExerciseType getExerciseType() { return exerciseType; }
    public void setExerciseType(ExerciseType exerciseType) { this.exerciseType = exerciseType; }

    public EquipmentType getEquipmentType() { return equipmentType; }
    public void setEquipmentType(EquipmentType equipmentType) { this.equipmentType = equipmentType; }

    public List<String> getPhotos() { return photos; }
    public void setPhotos(List<String> photos) { this.photos = photos; }

    public List<String> getVideos() { return videos; }
    public void setVideos(List<String> videos) { this.videos = videos; }

    public DifficultyLevel getDifficultyLevel() { return difficultyLevel; }
    public void setDifficultyLevel(DifficultyLevel difficultyLevel) { this.difficultyLevel = difficultyLevel; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }



}

