package ru.mirea.lab6.ex11;

// Интерфейс Convertable с методом convert
interface Convertable {
    double convert(double temperature);
}

// Класс, реализующий интерфейс Convertable для конвертации из Цельсия в Кельвины
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}

// Класс, реализующий интерфейс Convertable для конвертации из Цельсия в Фаренгейты
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // Температура в градусах Цельсия

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        // Конвертация в Кельвины
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        System.out.println("Температура в Кельвинах: " + kelvinTemperature);

        // Конвертация в Фаренгейты
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);
        System.out.println("Температура в Фаренгейтах: " + fahrenheitTemperature);
    }
}
