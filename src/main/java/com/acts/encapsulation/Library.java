package com.acts.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book game = new Book("Game of thrones", 500);
        Book bible = new Book("Holy Bible", 2000);
        Book shop = new Book("shop", 30);
        Book cleanCode = new Book("Clean code", 20);
        Book[] books = new Book[4];
        books[0] = game;
        books[1] = bible;
        books[2] = shop;
        books[3] = cleanCode;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
