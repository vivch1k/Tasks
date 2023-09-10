package ru.mirea.lab3.strForm;

public class Currency {
    private double rub;

    Currency(double rub){
        this.rub = rub;
    }

    public double toEuro(){
        return rub * 0.0095;
    }

    public double toUsd(){
        return rub * 0.010;
    }


    public double toYuan(){
        return rub * 0.074;
    }
}
