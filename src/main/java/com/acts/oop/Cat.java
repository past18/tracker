package com.acts.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " eat " + this.food);
    }

    public void giveNick(String name) {
        this.name = name;
    }

    public void eat(String food) {
        this.food = food;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}
