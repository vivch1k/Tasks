package ru.mirea.lab4_1.ex1;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.getType());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());

        Shape r1 = new Rectangle(5, 10);
        System.out.println(r1.toString());
    }
}