package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull (message = "A location is required!")
    @NotBlank (message = "A location is required!")
    @Size (min = 5, max = 50, message = "The location must be between 5 and 50 characters!")
    private String location;

    public Employer (@Size (min = 5, max = 50, message = "The location must be between 5 and 50 characters!") @NotNull (message = "A location is required!") @NotBlank (message = "A location is required!") String location){
        this.location = location;
    }
    public Employer () {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
