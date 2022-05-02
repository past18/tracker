package com.acts.inheritance;

public class Builder extends Engineer {
    private String specialization;

    public Builder(String name, String age, String education, int countProjects, String specialization) {
        super(name, age, education, countProjects);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
