package ru.mirea.lab8.ex17;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");
        int maximum = findMaximum(scanner, 0);
        System.out.println("Наибольшее значение в последовательности: " + maximum);
    }

    private static int findMaximum(Scanner scanner, int currentMax) {
        int number = scanner.nextInt();

        if (number == 0) {
            return currentMax;
        }

        if (number > currentMax) {
            return findMaximum(scanner, number);
        } else {
            return findMaximum(scanner, currentMax);
        }
    }

}
