package ru.mirea.lab7.ex3;

public class MathFunc implements MathCalculable{

    @Override
    public double pow(double num, int n) {
        double res = num;
        for (int i = 1; i < n; i++)
            res *= num;
        return res;
    }

    @Override
    public double module_complex_num(double x, double y) {
        return Math.sqrt(pow(x, 2) + pow(y, 2));
    }

    @Override
    public double PI() {
        return 3.14159265359;
    }


    public static void main(String[] args) {
        MathFunc m1 = new MathFunc();
        System.out.println(m1.pow(3, 4));
        System.out.println(m1.module_complex_num(-5, 15));
    }
}
