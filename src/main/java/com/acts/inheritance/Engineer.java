package com.acts.inheritance;

public class Engineer extends Profession {
    private int countProjects;

    public Engineer(String name, String age, String education, int countProjects) {
        super(name, age, education);
        this.countProjects = countProjects;
    }

    public int getCountProjects() {
        return countProjects;
    }
}
