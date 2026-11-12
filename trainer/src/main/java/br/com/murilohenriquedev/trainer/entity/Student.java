package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User {

    private LocalDate birthDate;

    private Double weight;

    private Double height;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "personal_trainer_id")
    private PersonalTrainer personalTrainer;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PersonalTrainer getPersonalTrainer() {
        return personalTrainer;
    }

    public void setPersonalTrainer(PersonalTrainer personalTrainer) {
        this.personalTrainer = personalTrainer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(birthDate, student.birthDate) && Objects.equals(weight, student.weight) && Objects.equals(height, student.height) && Objects.equals(gender, student.gender) && Objects.equals(personalTrainer, student.personalTrainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthDate, weight, height, gender, personalTrainer);
    }
}
