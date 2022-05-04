package com.acts.encapsulation;

public class Book {

    private String name;
    private int page;

    public static int indexOfNull(Book[] books) {
        int temp = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                temp = i;
                break;
            }
        }
        return temp;


    }

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
