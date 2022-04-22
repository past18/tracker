package com.acts.ballStory;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.println("Story about Ball");
        System.out.println("Ball went for a walk in the woods");
        System.out.println("Ball met the hare");
        hare.tryEat(ball);
        System.out.println("Ball met the wolf");
        wolf.tryEat(ball);
        System.out.println("Ball met the fox");
        fox.tryEat(ball);
    }
}
