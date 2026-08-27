package WEEK1_EXERCISE.Notification_System;

public class Main {
    public static void main(String[] args) {
        AlertSystem alertSystem = new Email();
        NotificationManager notificationManager = new NotificationManager(alertSystem);
        notificationManager.Message();
    }
}
