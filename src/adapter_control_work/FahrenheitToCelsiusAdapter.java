package adapter_control_work;

public class FahrenheitToCelsiusAdapter implements TemperatureSensor{
    private TemperatureSensor sensor;

    public FahrenheitToCelsiusAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        double temperatureInFahrenheit = sensor.getTemperatureInFahrenheit();

        return (temperatureInFahrenheit - 32) * 5/9;
    }
}
