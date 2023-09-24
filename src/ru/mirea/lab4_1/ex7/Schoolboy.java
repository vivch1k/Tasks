package ru.mirea.lab4_1.ex7;

public class Schoolboy extends Learner{
    int _class;
    String name;

    Schoolboy(int _class, String name)
    {
        this._class = _class;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + ", class: " + _class);
    }
}
