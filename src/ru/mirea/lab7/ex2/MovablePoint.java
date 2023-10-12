package ru.mirea.lab7.ex2;

import ru.mirea.lab6.ex2.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
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
