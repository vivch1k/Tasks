package ru.mirea.lab6.ex1;


public class TestMove {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(10, 10, 5, 5);
        System.out.println(m1.toString());

        Movable m2 = (Movable) new MovableCircle(10, 10, 5, 3, 7);
        System.out.println("\n" + m2.toString());
        m2.moveUp();
        System.out.println(m2.toString());
    }
}
