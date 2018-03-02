package com.example.superordenata.juegojump;

public class Assets {

    public static Image background, ball, pk2, jump, right, stand, ducking, left;

    public static void load(Graphics g) {
        Assets.background = g.newImage("background.png");
        Assets.pk2 = g.newImage("background.jpg");
        Assets.ball = g.newImage("arrow.png");
        Assets.jump = g.newImage("normal.png");
        Assets.right = g.newImage("right.png");
        Assets.stand = g.newImage("normal.png");
        Assets.left = g.newImage("left.png");
        Assets.ducking = g.newImage("ducking.png");
    }
}