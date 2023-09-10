package ru.mirea.lab3.ex2;

public class Tester {

    public static Circle big_circle(Circle[] arr) {
        Circle res = new Circle(0, 0, 0);
        for (int i = 0; i < arr.length; i++) {
            if (res.getRadius() < arr[i].getRadius())
                res = arr[i];
        }
        return res;
    }

    public static Circle small_circle(Circle[] arr) {
        Circle res = new Circle(0, 0, 1000);
        for (int i = 0; i < arr.length; i++) {
            if (res.getRadius() > arr[i].getRadius())
                res = arr[i];
        }
        return res;
    }

    public  static Circle[] sort(Circle[] carr) {
        Circle[] arr = carr;
        for (int i = 0; i < arr.length - 1; i++)
        for (int j = 0; j < arr.length - i - 1; j++)
        {
            if (arr[j].getRadius() > arr[j + 1].getRadius()) {
                Circle temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 5;
        Circle[] arr = new Circle[size];
        for (int i = 1; i <= size; i++) {
            arr[i-1] = new Circle((int)(Math.random()*20), (int)(Math.random()*20), (int)(Math.random()*20));
        }

        for (Circle el : arr)
            System.out.println(el.toString());

        System.out.println();
        System.out.println(big_circle(arr).toString());
        System.out.println(small_circle(arr).toString());

        arr = sort(arr);
        System.out.println();
        for (Circle el : arr)
            System.out.println(el.toString());
    }
}
