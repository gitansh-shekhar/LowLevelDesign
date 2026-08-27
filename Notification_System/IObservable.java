package Notification_System;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyy(INotification notification);
}
