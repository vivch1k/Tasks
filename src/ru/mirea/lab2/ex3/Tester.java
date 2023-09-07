package ru.mirea.lab2.ex3;

public class Tester {
    public static void main(String[] args) {
        int size = 3;
        Circle[] arr = new Circle[size];
        for (int i = 1; i <= size; i++) {
            arr[i-1] = new Circle(10 + i*10, 10 + i*5, i*2);
        }

        for (Circle el : arr)
            System.out.println(el.toString());

    }
}
