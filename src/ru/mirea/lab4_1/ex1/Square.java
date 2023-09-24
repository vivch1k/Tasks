package ru.mirea.lab4_1.ex1;

public class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;

    }
    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    public String toString() {
        return "side " + getSide() + ", area " + getArea() + ", per " + getPerimeter();
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
