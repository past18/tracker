package com.acts.tracker;


public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserActions[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserActions action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserActions[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserActions[] actions = {
                new CreateItem(output), new ShowItems(output), new EditItem(output),
                new DeleteItem(output), new FindItemById(output), new FindItemByName(output), new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}