package ru.mirea.lab2.ex7;


public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("C++", 2013, 1000);
        Book b2 = new Book("Python", 2019 , 700);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b1.setPage(1500);
        System.out.println(b1.getPage());
        System.out.println(b1.toString());
    }
}
