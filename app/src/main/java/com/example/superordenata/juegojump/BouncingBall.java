package com.example.superordenata.juegojump;

public class BouncingBall extends GameObject {

    public BouncingBall() {
        super(Assets.ball);
        this.setSpeedX(5);
        this.setSpeedY(5);
    }

    public void update() {
        /*if(isTouched()) {
            Random r = new Random();
            setX(r.nextInt(this.getGraphics().getWidth() - this.getImage().getBitmap().getWidth()));
            setY(r.nextInt(this.getGraphics().getHeight() - this.getImage().getBitmap().getHeight()));
            setSpeedX(5 - r.nextInt(10));
            setSpeedY(5 - r.nextInt(10));
        }*/
        if (this.getX() > this.getGraphics().getWidth() - this.getImage().getBitmap().getWidth() || this.getX() < 0) {
            this.setSpeedX(- this.getSpeedX());
        }
        this.setX(this.getX() + this.getSpeedX());
        if (this.getY() > this.getGraphics().getHeight() - this.getImage().getBitmap().getHeight() ||  this.getY() < 0) {
            this.setSpeedY(- this.getSpeedY());
        }
        this.setY(this.getY() + this.getSpeedY());
    }

}