package ru.mirea.lab4.ex2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    TShirt(Size size, String color, int price) {
        super(size, color, price);
    }

    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " руб" +
                ", цвет = " + getColor() +
                "}";
    }
}
