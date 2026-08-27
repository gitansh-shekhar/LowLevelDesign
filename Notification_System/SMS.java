package Notification_System;

public class SMS implements INotificationStrategy{
    @Override
    public void sendNotification(INotification notification){
        System.out.println("Notification sent through SMS : "+notification.getContent());
    }
}
