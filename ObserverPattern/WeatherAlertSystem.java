package ObserverPattern;

public class WeatherAlertSystem implements Observers {
    @Override
    public void update(double temperature, double humidity) {
        //  Fires alert ONLY if the condition is crossed!
        if (temperature > 40.0) {
            System.out.println("⚠️ WARNING: Dangerous Extreme Heatwave Detected! Temp: " + temperature + "°C");
        }
    }
}
