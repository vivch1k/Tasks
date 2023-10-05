package ru.mirea.lab6.ex2;

public class TestMove {
    public static void main(String[] args) {
        MovableRectangle m3 = new MovableRectangle(10, 10, 50, 30, 5, 7);
        System.out.println("\n" + m3.toString());
        m3.moveUp();
        System.out.println(m3.toString());
        m3.moveLeft();
        System.out.println(m3.toString());
    }
}
