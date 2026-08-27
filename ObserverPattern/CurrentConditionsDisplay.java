package ObserverPattern;

public class CurrentConditionsDisplay implements Observers {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("[Screen Display] Temp: " + temperature + "°C | Humidity: " + humidity + "%");
    }
}