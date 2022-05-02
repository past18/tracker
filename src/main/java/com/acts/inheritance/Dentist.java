package com.acts.inheritance;

public class Dentist extends Doctor {
    private int toothPrice;

    public Dentist(String name, String age, String education, String doctoralDegree, int toothPrice) {
        super(name, age, education, doctoralDegree);
        this.toothPrice = toothPrice;
    }

    public int getToothPrice() {
        return toothPrice;
    }
}
