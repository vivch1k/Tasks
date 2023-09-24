package ru.mirea.lab4_1.ex2;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {}
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер " + number);
    }

    public String getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void sendMessage(String... numbers) {
        for (String num : numbers)
            System.out.println(num);
    }

}
