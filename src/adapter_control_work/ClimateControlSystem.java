package adapter_control_work;

public class ClimateControlSystem {
    private TemperatureSensor temperatureSensor;

    public ClimateControlSystem(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }
    public void monitorTemperature() {
        double temperatureInCelsius = temperatureSensor.getTemperatureInFahrenheit();
        
        System.out.println("Текущая температура в Цельсиях: " + temperatureInCelsius);
    }
}
