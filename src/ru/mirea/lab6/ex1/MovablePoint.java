package ru.mirea.lab6.ex1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x " + this.x + ", y " + this.y + ", xSpeed " + this.xSpeed + ", ySpeed " + this.ySpeed;
    }

    @Override
    public void moveUp() {
        x += xSpeed;
    }

    @Override
    public void moveDown() {
        x -= xSpeed;
    }

    @Override
    public void moveLeft() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        y += ySpeed;
    }
}
