package com.acts.tracker;

public class DeleteItem implements UserActions {
    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Application deleted successfully.");
        } else {
            out.println("Request delete error.");
        }
        return true;
    }
}
