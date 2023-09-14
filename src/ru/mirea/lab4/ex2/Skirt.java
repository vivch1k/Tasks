package ru.mirea.lab4.ex2;

public class Skirt extends Clothes implements WomenClothing{
    Skirt(Size size, String color, int price) {
        super(size, color, price);
    }

    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " руб" +
                ", цвет = " + getColor() +
                "}";
    }
}
