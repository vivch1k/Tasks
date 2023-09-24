package ru.mirea.lab4_1.ex10;

public class Car extends Transport{
    public double count_cost_pass(int time){
        return time * 2  * 1000;
    }
    public double count_cost_cargo(int time){
        return time * 1.5  * 1000;
    }
}
