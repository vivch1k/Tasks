package ru.mirea.lab4_1.ex10;

public class Ship extends Transport{
    public double count_cost_pass(int time){
        return time * 4  * 1000;
    }
    public double count_cost_cargo(int time){
        return time * 3.75  * 1000;
    }
}
