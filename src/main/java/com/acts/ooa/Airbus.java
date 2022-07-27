package com.acts.ooa;

public final class Airbus extends AirCraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Airplane model: " + name);
    }

    public void printCountEngine() {
        if (getName().equals("A380")) {
            System.out.println("The number of engines is: " + 4);
        } else {
            System.out.println("The number of engines is: " + COUNT_ENGINE);
        }
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
