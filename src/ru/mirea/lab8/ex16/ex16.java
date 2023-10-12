package ru.mirea.lab8.ex16;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");
        int count = countMaxElementOccurrences(scanner, 0, 0);
        System.out.println("Количество элементов, равных максимальному: " + count);
    }
    //14 182 183 45 182 89 183 51 183 0
    private static int countMaxElementOccurrences(Scanner scanner, int max, int count) {
        int number = scanner.nextInt();

        if (number == 0) {
            return count;
        }

        if (number > max) {
            return countMaxElementOccurrences(scanner, number, 1);
        } else if (number == max) {
            return countMaxElementOccurrences(scanner, max, count + 1);
        } else {
            return countMaxElementOccurrences(scanner, max, count);
        }
    }
}
