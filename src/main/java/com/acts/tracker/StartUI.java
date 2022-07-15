package com.acts.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker, UserActions[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserActions action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserActions[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserActions[] actions = {
                new CreateItem(), new ShowItems(), new EditItem(),
                new DeleteItem(), new FindItemById(), new FindItemByName(), new Exit()
        };
        new StartUI().init(input, tracker, actions);
    }
}