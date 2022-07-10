package com.acts.io;

import java.util.Scanner;

public class Game11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + "write number from 1 to 3:");
            int matches = Integer.parseInt(input.nextLine());
            if ((matches > 3) || (matches < 1) || (matches > count)) {
                System.out.println("Wrong number, try again");
            } else {
                turn = !turn;
                count = count - matches;
                System.out.println("Left " + count + " matches");
            }
        }
        if (!turn) {
            System.out.println("First player win");
        } else {
            System.out.println("Second player win");
        }
    }
}

