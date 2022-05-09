package com.acts.encapsulation;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqMetTest() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first.equals(second), is(true));
    }

    @Test
    public void notEqMetTest() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("Audio");
        assertThat(first.equals(second), is(false));
    }

    @Test
    public void notEqMetTest2() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setModel("audio");
        assertThat(first.equals(second), is(false));
    }
}