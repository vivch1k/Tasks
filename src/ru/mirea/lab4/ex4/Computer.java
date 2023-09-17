package ru.mirea.lab4.ex4;

public class Computer {
    private Title name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    Computer(Title name, double frequency, int size, int diagonal) {
        this.name = name;
        this.processor = new Processor(frequency);
        this.memory = new Memory(size);
        this.monitor = new Monitor(diagonal);
    }

    public void turnOn() {
        System.out.println("ПК включен");
        monitor.turnOn();
    }

    public void turnOff() {
        System.out.println("ПК выключен");
        monitor.turnOff();
    }

    public String toString() {
        return "Название: " + name +
                "\nЧастота процессора: " + processor.getFrequency() +
                "\nОбъем памяти: " + memory.getSize() +
                "\nДиагональ монитора: " + monitor.getDiagonal();
    }

}
