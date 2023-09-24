package ru.mirea.lab4_1.ex5;

public class TestReader {
    public static void main(String[] args){
        Reader r1 = new Reader("Петров В. В.", 1, "филологический", "14.03.2000", "89251744255");
        Reader r2 = new Reader("Иванов А. А.", 2, "юридических ", "16.11.2001", "89241654265");

        Reader[] arr = {r1, r2};

        arr[0].takeBook(2);
        arr[0].takeBook("Приключения", "Энциклопедия");
        arr[1].takeBook(1);
        arr[1].takeBook("Энциклопедия");
    }
}
