package Notification_System;

public class Logger implements IObserver{
    NotificationService notificationService;
    NotificationObservable notificationObservable;
    Logger(NotificationService notificationService){
       this.notificationService =notificationService;
       notificationObservable = (NotificationObservable) notificationService.getObservable();
       notificationObservable.add(this);
    }
    @Override
    public void update(INotification notification) {
        System.out.println("Logged notification :"+ notification.getContent());
    }

}
