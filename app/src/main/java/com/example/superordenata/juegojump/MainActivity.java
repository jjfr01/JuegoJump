package com.example.superordenata.juegojump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends GenericGameActivity {

    private BouncingBall b1, b2;
    private Tipejo t;

    @Override
    public void start() {
        addGameObject(new Fondo());
        b1 = new BouncingBall();
        b1.setX(this.getGraphics().getWidth() - b1.getWidth());
        b1.setY(this.getGraphics().getHeight() - b1.getHeight());
        addGameObject(b1);
        /*b2 = new BouncingBall();
        b2.setSpeedX(10);
        b2.setSpeedY(10);
        b2.setX(300);
        addGameObject(b2);*/
        t = new Tipejo();
        addGameObject(t);
    }

    @Override
    public void update() {
        super.update();
        /*boolean chocan = b1.instersects(b2);

        if(chocan){

            if(b1. getX() > b2.getX()){
                b1.setSpeedX(+3);
                b2.setSpeedX(-(+3));
            }else{
                b1.setSpeedX(-(+3));
                b2.setSpeedX(+3);
            }
            if(b1. getY() > b2.getY()){
                b1.setSpeedY(+3);
                b2.setSpeedY(-(+3));
            }else{
                b1.setSpeedY(-(+3));
                b2.setSpeedY(+3);
            }
//            b1.setSpeedY(0);
//            b1.setSpeedX(0);
//
//            b2.setSpeedY(0);
//            b2.setSpeedX(0);
        }*/

        chocaPelota(t, b1);
        //chocaPelota(t, b2);
    }

    private boolean chocaPelota(Tipejo t, BouncingBall b){

        boolean chocan = t.instersects(b);
        if(chocan){
            /*t.setImage(Assets.ducking);
            if(t.getX() > b.getX()){
                b.setSpeedX(+8);
            }else{
                b.setSpeedX(+8);
            }
            if(t. getY() > b.getY()){
                b.setSpeedY(+8);
            }else{
                b.setSpeedY(+8);
            }*/
            start();
        } else {
            if(b1.getX() < 2*(- b1.getWidth())){
                Random r = new Random();
                int speed = -(r.nextInt(20 - 5) + 5);
                b1 = new BouncingBall();
                b1.setSpeedX(speed);
                b1.setX(this.getGraphics().getWidth() - b1.getWidth());
                b1.setY(this.getGraphics().getHeight() - b1.getHeight());
                addGameObject(b1);
            }
        }

        return true;
    }
}
