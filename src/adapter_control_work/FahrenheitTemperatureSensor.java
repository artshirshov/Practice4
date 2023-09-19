package adapter_control_work;

public class FahrenheitTemperatureSensor implements TemperatureSensor{
    @Override
    public double getTemperatureInFahrenheit() {
        return 72.0;
    }
}
