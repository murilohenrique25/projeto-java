package br.com.murilohenriquedev.trainer.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
@DiscriminatorValue("PERSONAL_TRAINER")
public class PersonalTrainer extends User {

    private String registration;

    private String specialization;

    private Integer experienceYears;

    private String bio;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalTrainer that = (PersonalTrainer) o;
        return Objects.equals(registration, that.registration) && Objects.equals(specialization, that.specialization) && Objects.equals(experienceYears, that.experienceYears) && Objects.equals(bio, that.bio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, specialization, experienceYears, bio);
    }
}
