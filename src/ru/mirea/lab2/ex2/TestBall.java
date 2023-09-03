package ru.mirea.lab2.ex2;

import ru.mirea.lab2.ex2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(50, 10);
        System.out.println(b1);
        b1.move(300, 150);
        System.out.println(b1);
    } }
