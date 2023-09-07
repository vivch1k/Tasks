package ru.mirea.lab2.ex6;


public class Circle{
    private int radius;
    private int x;
    private int y;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String toString() {
        return "x " + this.x + ", y " + this.y + ", radius " + this.radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double length() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle c1) {
        return this.radius == c1.radius;
    }

}
