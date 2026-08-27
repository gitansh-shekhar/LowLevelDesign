package WEEK1_EXERCISE.Notification_System;

public class SMS implements AlertSystem{
    @Override
    public void sendMessage() {
        System.out.println("Message Sent through SMS");
    }
}
