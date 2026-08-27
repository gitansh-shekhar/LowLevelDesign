package Notification_System;

public class Popup implements INotificationStrategy{
    @Override
    public void sendNotification(INotification notification) {
        System.out.println("Notification sent through popup : "+notification.getContent());
    }
}
