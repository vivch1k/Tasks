package ru.mirea.lab4_1.ex8;

public class Square extends Rectangle {
    Square(){
        super.width = 0.0;
        super.length = 0.0;
        super.color = "";
        super.filled = false;
    }
    Square(double side) {
        super.width = side;
        super.length = side;
        super.color = "";
        super.filled = false;
    }

    Square(double side, String color, boolean filled) {
        super.width = side;
        super.length = side;
        super.color = color;
        super.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return "side " + getSide() + ", area " + super.getArea() + ", per " + super.getPerimeter();
    }

}
