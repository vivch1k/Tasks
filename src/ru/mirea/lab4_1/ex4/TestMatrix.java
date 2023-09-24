package ru.mirea.lab4_1.ex4;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.show();
        m2.show();
        System.out.println();
        m1.subMat(m2);
        m1.show();
        System.out.println();
        m1.mutNum(10);
        m1.show();
    }
}
