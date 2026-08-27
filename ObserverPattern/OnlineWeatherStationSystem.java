package ObserverPattern;

public class OnlineWeatherStationSystem {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay screen = new CurrentConditionsDisplay();
        LoggerDisplay logger = new LoggerDisplay();
        WeatherAlertSystem alertSys = new WeatherAlertSystem();

        station.subscribe(screen);
        station.subscribe(logger);
        station.subscribe(alertSys);

        System.out.println("\n--- Normal Day (28°C) ---");
        station.setMeasurment(28.0, 65.0); // Alert stays completely silent

        System.out.println("\n--- Heatwave Arrives (43°C) ---");
        station.setMeasurment(43.5, 70.0); // Alert pops out dynamically!

        System.out.println("\n--- User closes display screen ---");
        station.unsubscribe(screen);

        System.out.println("\n--- Next Day (31°C) ---");
        station.setMeasurment(31.0, 50.0); // Only logger logs, screen remains blank
    }
}