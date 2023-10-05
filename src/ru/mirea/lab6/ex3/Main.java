package ru.mirea.lab6.ex3;

interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты различных классов
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota");

        // Вызываем метод getName() для объектов и выводим их имена
        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Марка автомобиля: " + car.getName());
    }
}