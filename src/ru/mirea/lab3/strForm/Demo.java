package ru.mirea.lab3.strForm;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 35000),
                new Employee("Петров Петр Петрович", 40000),
                new Employee("Сидоров Сидор Сидорович", 41500),
                new Employee("Зозуля Зоя Петровна", 32000),
                new Employee("Лукьянова Тамара Ивановна", 37000),
        };

        Report.generateReport(employees);
    }
}