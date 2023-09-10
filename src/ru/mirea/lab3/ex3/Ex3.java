package ru.mirea.lab3.ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++)
            arr[i] = (int)(10 + Math.random() * 99);

        for (int el : arr)
            System.out.print(el + " ");

        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                c++;
        }
        System.out.println();
        if (c == arr.length - 1)
            System.out.println("Последовательность строго возрастающая");
    }
}
