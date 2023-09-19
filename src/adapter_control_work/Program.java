package adapter_control_work;

public class Program {
    public static void main(String[] args) {
        // Создаем объект датчика с температурой в Фаренгейтах
        TemperatureSensor fahrenheitSensor = new FahrenheitTemperatureSensor();

        // Создаем адаптер для преобразования температуры в Цельсий
        TemperatureSensor celsiusAdapter = new FahrenheitToCelsiusAdapter(fahrenheitSensor);

        // Создаем климат-контрольную систему и передаем адаптированный датчик
        ClimateControlSystem climateControlSystem = new ClimateControlSystem(celsiusAdapter);

        // Мониторим температуру
        climateControlSystem.monitorTemperature();
    }
}
