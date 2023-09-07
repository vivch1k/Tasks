package ru.mirea.lab2.ex8;

public class RevString {
    public static void main(String[] args) {
        String[] arr = {"Hello", "cat", "dog", "car", "asd", "fd"};

        for (String el : arr)
            System.out.print(el + " ");

        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            String temp = "";
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }

        for (String el : arr)
            System.out.print(el + " ");

    }
}
