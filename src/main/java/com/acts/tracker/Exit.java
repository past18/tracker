package com.acts.tracker;

public class Exit implements UserActions {
    @Override
    public String name() {
        return "Exit Program" ;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        return false;
    }
}
