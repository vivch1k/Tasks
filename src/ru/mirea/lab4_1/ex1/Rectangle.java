package ru.mirea.lab4_1.ex1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;


    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
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

    public String getType() {
        return "Квадрат";
    }
}
