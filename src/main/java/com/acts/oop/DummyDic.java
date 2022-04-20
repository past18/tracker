package com.acts.oop;

public class DummyDic {
    public String dic(String word) {
        return "Some word: " + word;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.dic("Hi"));
    }
}
