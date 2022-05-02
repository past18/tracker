package com.acts.inheritance;

public class Profession {
    private String name;
    private String age;
    private String education;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public Profession(String name, String age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }
}
