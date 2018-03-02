package com.example.superordenata.juegojump;


public class Fondo extends GameBackground{


    public Fondo() {
        super(Assets.background);
        this.setBackgroundX(getGraphics().getWidth());
        this.setBackgroundY(getGraphics().getHeight());
        this.setMovement(Movement.MOVING);
    }
}
