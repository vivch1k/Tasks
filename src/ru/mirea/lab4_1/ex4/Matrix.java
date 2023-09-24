package ru.mirea.lab4_1.ex4;

import java.util.Scanner;

public class Matrix {
    private int row;
    private int col;
    private int[][] arr;

    Matrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Строки: ");
        this.row = input.nextInt();
        System.out.println("Столбцы: ");
        this.col = input.nextInt();
        System.out.println("Значения: ");
        arr = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = input.nextInt();
    }

    public int[][] getArr() {
        return arr;
    }

    void subMat(Matrix m1) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] += m1.getArr()[i][j];
    }

    void mutNum(int num) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] *= num;
    }

    void show() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
