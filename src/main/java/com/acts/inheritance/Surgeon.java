package com.acts.inheritance;

public class Surgeon extends Doctor {
    private String areaOfSurgery;

    public Surgeon(String name, String age, String education, String doctoralDegree, String areaOfSurgery) {
        super(name, age, education, doctoralDegree);
        this.areaOfSurgery = areaOfSurgery;
    }

    public String getAreaOfSurgery() {
        return areaOfSurgery;
    }
}
