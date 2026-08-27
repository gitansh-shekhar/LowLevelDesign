package Notification_System;

public class SimpleNotification implements INotification{
    private String message;
    public SimpleNotification(String message){
        this.message = message;
    }
    @Override
    public String getContent() {
        return message;
    }
}
