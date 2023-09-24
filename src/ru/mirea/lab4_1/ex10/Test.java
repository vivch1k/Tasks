package ru.mirea.lab4_1.ex10;

public class Test {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Train t1 = new Train();
        Ship s1 = new Ship();
        Car c1 = new Car();
        System.out.println(a1.count_cost_pass(12));
        System.out.println(t1.count_cost_pass(12));
        System.out.println(s1.count_cost_pass(12));
        System.out.println(c1.count_cost_pass(12));
    }
}
