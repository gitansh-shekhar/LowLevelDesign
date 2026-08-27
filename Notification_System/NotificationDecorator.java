package Notification_System;

public abstract class NotificationDecorator implements INotification {
    INotification notification ;
    NotificationDecorator(INotification notification){
       this.notification = notification;
    }
    public String getContent(){
        return notification.getContent();
    }


}
