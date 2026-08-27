package Notification_System;

public class Email implements INotificationStrategy{
    @Override
    public void sendNotification(INotification notification) {
        System.out.println("Sent throung Email : "+ notification.getContent());
    }

}
