package com.acts.tracker;

public class DeleteItem implements UserActions{
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Application deleted successfully.");
        } else {
            System.out.println("Request delete error.");
        }
        return true;
    }
}
