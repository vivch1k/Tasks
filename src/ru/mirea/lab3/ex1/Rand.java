package ru.mirea.lab3.ex1;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int)(Math.random() * 100);

        for (int el : arr)
            System.out.print(el + " ");

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        for (int el : arr)
            System.out.print(el + " ");

        System.out.println();

        Random rand = new Random();

        for (int i = 0; i < 10; i++)
            arr[i] = rand.nextInt(100);

        for (int el : arr)
            System.out.print(el + " ");

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        for (int el : arr)
            System.out.print(el + " ");

    }
}
