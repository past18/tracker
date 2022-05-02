package com.acts.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String age, String education, int countProjects, String language) {
        super(name, age, education, countProjects);
        this.language = language;
    }
}
