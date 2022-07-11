package com.acts.poly;

public class Bus implements Transport {
    @Override
    public void ride() {

    }

    @Override
    public void passengers(int quantity) {

    }

    @Override
    public int refuel(int fuel) {
        return fuel * 4;
    }
}
