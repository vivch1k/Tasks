package ru.mirea.lab2.ex6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(100, 150, 7);
        Circle c2 = new Circle(10, 15, 6);
        System.out.println(c1.equals(c2));
        c2.setRadius(7);
        System.out.println(c1.equals(c2));
        System.out.println(c2.area());
        System.out.println(c2.length());
    }
}
