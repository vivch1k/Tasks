package ru.mirea.lab4.ex2;

public class Tie extends Clothes implements MenClothing{

    Tie(Size size, String color, int price) {
        super(size, color, price);
    }


    public String toString() {
        return "Галстук{" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " руб" +
                ", цвет = " + getColor() +
                "}";
    }
}
