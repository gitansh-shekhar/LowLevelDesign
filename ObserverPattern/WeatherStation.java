package ObserverPattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStation {
    private double temperature;
    private double humidity;

    // Pro Tip: Using CopyOnWriteArrayList prevents crashes if a thread
    // unsubscribes right in the middle of a broadcast loop!
    private final List<Observers> list = new CopyOnWriteArrayList<>();

    public void setMeasurment(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        sendNotification();
    }

    public void subscribe(Observers ob){
        if(!list.contains(ob)){
            list.add(ob);
            System.out.println("Subscribed Successfully");
        }
    }

    public void unsubscribe(Observers ob){
        if(list.contains(ob)){
            list.remove(ob);
            System.out.println("Successfully Unsubscribed");
        }
    }

    private void sendNotification(){
        for(Observers observer : list){
            observer.update(temperature, humidity);
        }
    }
}