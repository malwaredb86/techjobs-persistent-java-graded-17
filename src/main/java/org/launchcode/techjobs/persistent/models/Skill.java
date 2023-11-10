package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "A description is required!")
    @NotBlank(message = "A description is required!")
    @Size(min = 25, max = 350, message = "The description must be between 25 and 350 characters!")
    private String description;

    @ManyToMany (mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill (@Size (min = 5, max = 50, message = "The description must be between 25 and 350 characters!") @NotNull (message = "A location is required!") @NotBlank (message = "A location is required!") String description){
        this.description = description;
    }
    public Skill () {};

    public List<Job> getJobs() {
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
