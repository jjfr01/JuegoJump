package com.example.superordenata.juegojump;

public class Assets {

    public static Image background, ball, pk2, jump, right, stand, ducking;

    public static void load(Graphics g) {
        Assets.background = g.newImage("background.jpg");
        Assets.pk2 = g.newImage("pk2.jpg");
        Assets.ball = g.newImage("ball.png");
        Assets.jump = g.newImage("jump.png");
        Assets.right = g.newImage("right.png");
        Assets.stand = g.newImage("stand.png");
        Assets.ducking = g.newImage("ducking.png");
    }
}