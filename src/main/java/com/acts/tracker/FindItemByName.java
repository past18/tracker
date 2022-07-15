package com.acts.tracker;

public class FindItemByName implements UserActions {
    @Override
    public String name() {
        return "Find items by name" ;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Application with name: " + name + "  not found.");

        }
        return true;
    }

}
