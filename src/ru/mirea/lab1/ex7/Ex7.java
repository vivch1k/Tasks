package ru.mirea.lab1.ex7;

public class Ex7 {

    public static int fact(int a){
        int res = 1;
        for (int i = 1; i <= a; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
