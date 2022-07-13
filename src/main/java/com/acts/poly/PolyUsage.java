package com.acts.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle car = new Car();
        Vehicle[] vehicles = new Vehicle[]{car, train, airplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
