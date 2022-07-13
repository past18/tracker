package com.acts.poly;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rides on the road");
    }
}
