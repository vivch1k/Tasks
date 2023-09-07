package ru.mirea.lab2.ex4;

import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private String[] compArr;

    public void addComp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во компьютеров: ");
        int size = input.nextInt();
        compArr = new String[size];
        String name = "";
        for (int i = 0;i < size; i++)
        {
            System.out.println("Введите название компьютера: ");
            name = input.next();
            compArr[i] = new String(name);
        }
        input.close();
    }

    public void delComp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название компьютера который хотите удалить: ");
        String name = input.next();
        for (int i = 0; i < compArr.length; i++) {
            if (Objects.equals(compArr[i], name)) {
                System.out.println("Компьютер " + name + " удален");
                compArr[i] = "";
                input.close();
                return;
            }
        }
        System.out.println("Компьютер " + name + " не найден");
        input.close();
    }

    public void searchComp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название компьютера который хотите найти: ");
        String name = input.next();
        for (int i = 0; i < compArr.length; i++) {
            if (Objects.equals(compArr[i], name)) {
                System.out.println("Компьютер " + name + " найден");
                input.close();
                return;
            }
        }
        System.out.println("Компьютер " + name + " не найден");
        input.close();
    }
}
