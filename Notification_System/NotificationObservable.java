package Notification_System;

import ObserverPattern.Observers;

import java.util.ArrayList;

public class NotificationObservable implements IObservable{
    ArrayList<IObserver> observers;
    NotificationObservable(){
        observers = new ArrayList<>();
    }
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyy(INotification notification) {
         for(IObserver observer : observers){
             observer.update(notification);
         }
    }
}
