package ru.mirea.lab3.ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[4];
        for (int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * n);

        for (int el : arr)
            System.out.print(el + " ");

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = k; j < 4; j++)
            {
                if (arr[i] % 2 == 0) {
                    arr2[j] = arr[i];
                    k++;
                    break;
                }
                else break;
            }
        }
        System.out.println();
        for (int el : arr2)
            System.out.print(el + " ");
    }
}
