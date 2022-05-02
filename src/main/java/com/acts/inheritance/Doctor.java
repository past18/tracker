package com.acts.inheritance;

public class Doctor extends Profession {
    private String doctoralDegree;

    public Doctor(String name, String age, String education, String doctoralDegree) {
        super(name, age, education);
        this.doctoralDegree = doctoralDegree;
    }


    public String getDoctoralDegree() {
        return doctoralDegree;
    }

}
