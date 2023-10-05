package ru.mirea.lab6.ex6to10;

// Интерфейс Printable с методом print()
interface Printable {
    void print();
}

// Класс Book, реализующий интерфейс Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }
}

// Класс Shop, реализующий интерфейс Printable
class Shop implements Printable {
    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + shopName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем массив типа Printable и заполняем его объектами
        Printable[] printableObjects = new Printable[4];
        printableObjects[0] = new Book("Война и мир");
        printableObjects[1] = new Shop("Книжный магазин 'Книги и Ко'");
        printableObjects[2] = new Book("Гарри Поттер и философский камень");
        printableObjects[3] = new Shop("Супермаркет 'Продукты'");

        // Проходимся по массиву и вызываем метод print() для каждого объекта
        for (Printable printable : printableObjects) {
            printable.print();
        }
    }
}
