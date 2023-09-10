package ru.mirea.lab3.wrapper;

public class Ex1 {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("10.5");
        System.out.println(d1);

        double d2 = Double.parseDouble("45.6");
        System.out.println(d2);

        byte b1 = (byte) d1.intValue();
        char c1 = (char) d1.intValue();
        float f1 = d1.floatValue();
        int i1 = d1.intValue();
        long l1 = d1.longValue();
        short s1 = d1.shortValue();

        String str = Double.toString(3.4);

    }
}
