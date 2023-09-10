package ru.mirea.lab3.strForm;

public class Prod {
    private String name;
    private String curr;
    private double price;

    Prod(String name, String curr, double price){
        this.name = name;
        this.curr = curr;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCurr() {
        return curr;
    }

    public String getName() {
        return name;
    }
}
