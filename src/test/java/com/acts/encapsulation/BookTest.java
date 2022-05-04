package com.acts.encapsulation;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class BookTest {
    @Test
    public void whenLastNull() {
        Book[] products = new Book[5];
        products[0] = new Book("Milk", 10);
        products[1] = new Book("Bread", 4);
        products[2] = new Book("Egg", 19);
        int rsl = Book.indexOfNull(products);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        Book[] products = new Book[5];
        products[1] = new Book("Milk", 10);
        int rsl = Book.indexOfNull(products);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Book[] products = new Book[1];
        products[0] = new Book("Milk", 10);
        int rsl = Book.indexOfNull(products);
        assertThat(rsl, is(-1));
    }
}