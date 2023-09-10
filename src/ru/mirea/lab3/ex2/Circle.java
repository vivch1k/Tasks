package ru.mirea.lab3.ex2;


public class Circle {
    private int radius;
    private Point center;

    Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public String toString() {
        return "x " + this.center.x + ", y " + this.center.y + ", radius " + this.radius;
    }


    public void setCenter(int x, int y) {
        this.center = new Point(x, y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
}
