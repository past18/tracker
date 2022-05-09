package com.acts.encapsulation;

public class BookDrop {
    public static Book[] delete(Book[] books, int index) {
        for (int i = index; i < books.length; i++) {
            if (i < books.length - 1) {
                books[i] = books[i + 1];
            } else {
                books[i] = null;
            }
        }
        return books;
    }
}
