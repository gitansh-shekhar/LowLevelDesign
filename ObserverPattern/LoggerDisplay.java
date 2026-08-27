package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class LoggerDisplay implements Observers {
    private final List<String> historyLog = new ArrayList<>();

    @Override
    public void update(double temperature, double humidity) {
        String logEntry = "Log timestamp: Temp=" + temperature + ", Hum=" + humidity;
        historyLog.add(logEntry); //  Safely saves history state internally
        System.out.println("[Logger] Metric archived. History size: " + historyLog.size());
    }
}