package ru.mirea.lab2.ex5;


import java.util.Scanner;

public class TestDog {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество собак: ");
        int size = input.nextInt();
        Dog[] arr = new Dog[size];
        String name = "";
        int age = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите имя: ");
            name = input.next();
            System.out.println("Введите возраст: ");
            age = input.nextInt();
            arr[i] = new Dog(name, age);
        }

        for (Dog el : arr)
            System.out.println(el.toString());




    }
}
