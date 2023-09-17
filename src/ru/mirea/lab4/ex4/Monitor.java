package ru.mirea.lab4.ex4;

public class Monitor {
    private int diagonal;

    Monitor(int  diagonal) {
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void turnOn() {
        System.out.println("Монитор включен");
    }

    public void turnOff() {
        System.out.println("Монитор выключен");
    }
}
