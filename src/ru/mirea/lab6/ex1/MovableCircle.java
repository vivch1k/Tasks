package ru.mirea.lab6.ex1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "x " + this.center.x + ", y " + this.center.y + ", xSpeed " + this.center.xSpeed + ", ySpeed " + this.center.ySpeed + ", radius " + this.radius;
    }

    @Override
    public void moveUp() {
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveDown() {
        this.center.x -= this.center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.y += this.center.ySpeed;
    }
}
