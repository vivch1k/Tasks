package ru.mirea.lab4.ex2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    Pants(Size size, String color, int price) {
        super(size, color, price);
    }


    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " руб" +
                ", цвет = " + getColor() +
                "}";
    }
}
