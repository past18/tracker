package com.acts.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public String askStr(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
