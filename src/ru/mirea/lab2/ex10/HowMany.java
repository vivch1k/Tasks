package ru.mirea.lab2.ex10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] word = str.split(" ");
        System.out.println(word.length);
    }
}
