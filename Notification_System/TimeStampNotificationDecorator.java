package Notification_System;

import java.time.LocalDateTime;

public class TimeStampNotificationDecorator extends NotificationDecorator{

    TimeStampNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return notification.getContent() +" "+ LocalDateTime.now();
    }
}
