package ru.mirea.lab4_1.ex1;

public class Circle extends Shape {
    protected double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2) ;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "r " + this.radius + ", area " + this.getArea() + ", perimeter " + this.getPerimeter();
    }

    public String getType() {
        return "Круг";
    }

}
