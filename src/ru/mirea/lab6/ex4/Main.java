package ru.mirea.lab6.ex4;


interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;
    private double hours;

    public Service(String serviceName, double hourlyRate, double hours) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    public String getServiceName() {
        return serviceName;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты разных классов
        Priceable product = new Product("Ноутбук", 1200.0);
        Priceable service = new Service("Ремонт", 50.0, 3.5);

        // Вызываем метод getPrice() для объектов и выводим цены
        System.out.println("Цена товара '" + ((Product) product).getName() + "': $" + product.getPrice());
        System.out.println("Цена услуги '" + ((Service) service).getServiceName() + "': $" + service.getPrice());
    }
}
