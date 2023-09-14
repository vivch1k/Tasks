package ru.mirea.lab4.ex2;

public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    Clothes(Size size, String color, int price){
        this.size = size;
        this.color = color;
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }


    public int getPrice() {
        return price;
    }
}
