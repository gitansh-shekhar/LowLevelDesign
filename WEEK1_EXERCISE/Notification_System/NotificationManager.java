package WEEK1_EXERCISE.Notification_System;

public class NotificationManager {

    AlertSystem alertSystem ;
    NotificationManager(AlertSystem alertSystem){
        this.alertSystem = alertSystem;
    }
    void Message(){
        alertSystem.sendMessage();
    }
}
