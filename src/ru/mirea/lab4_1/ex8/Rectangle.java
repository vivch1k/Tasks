package ru.mirea.lab4_1.ex8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle() {
        this.width = 0;
        this.length = 0;
        super.color = "";
        super.filled = false;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        super.color = "";
        super.filled = false;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "w " + this.width + ", l " + this.length + ", area " + this.getArea() + ", per " + this.getPerimeter();
    }
}
