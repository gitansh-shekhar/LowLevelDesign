package WEEK1_EXERCISE.Notification_System;

public class Email implements AlertSystem{
    @Override
    public void sendMessage() {
        System.out.println("Alert sent through Email");
    }
}
