package com.example.superordenata.juegojump;


public class Tipejo extends GameObject{

    private static final int MAXSALTO = 18;

    private Animation animation;
    private Long tiempo;
    private boolean saltando = false;
    private int salto = 0;

    public Tipejo() {
        super(Assets.stand);
        this.setX(0);
        this.setY(this.getGraphics().getHeight() - this.getHeight());
        animation = new Animation();
        animation.addFrame(Assets.left, 350);
        animation.addFrame(Assets.right, 350);
        tiempo = System.currentTimeMillis();
    }

    @Override
    public void update() {
        if(getTouchHandler().isTouched){
            this.setImage(Assets.stand);
            this.setSpeedX(0);
            if(!saltando){
                salto = -MAXSALTO;
                setSpeedY(salto);
                saltando = true;
        }
        /*if (getTouchHandler().isMoving() && getTouchHandler().isMovingUp()){
            this.setImage(Assets.stand);
            this.setSpeedX(0);
            if(!saltando){
                salto = -MAXSALTO;
                setSpeedY(salto);
                saltando = true;
            }*/
        /*} else if (getTouchHandler().isMoving() && getTouchHandler().isMovingRight()){
            this.setSpeedX(2);*/
        } else {
            animation.update((System.currentTimeMillis() - tiempo));
            tiempo = System.currentTimeMillis();
            this.setImage(animation.getImage());
            this.setSpeedX(0);
        }

        if (saltando){
            setY(getY() + getSpeedY());
            setX(getX() + 0);//Salta y avanza
            this.setImage(Assets.jump);
            setSpeedY(getSpeedY() + 1);
            salto++;
            if(salto > MAXSALTO){
                saltando = false;
                setSpeedY(0);
            }

        }

        if(this.getX() + this.getSpeedX() > 700){
            this.setX(700);
        }
        this.setX(this.getX() + this.getSpeedX());
    }
}
