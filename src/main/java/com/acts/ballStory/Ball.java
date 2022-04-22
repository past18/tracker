package com.acts.ballStory;

public class Ball {
    public void tryToRun(boolean condition) {
        String msg = condition ? "Ball run away" : "Ball was eaten";
        System.out.println(msg);
    }
}
