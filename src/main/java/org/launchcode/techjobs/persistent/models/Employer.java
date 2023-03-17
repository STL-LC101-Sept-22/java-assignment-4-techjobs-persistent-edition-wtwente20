package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be left blank.")
    @Size(min = 3, max = 100, message = "Location must have between 3 to 100 characters.")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer () {}

    public Employer(String location) {
        super();
        this.location = location;
    }
}
