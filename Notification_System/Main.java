package Notification_System;

public class Main {
    public static void main(String[] args) {
         INotification notification = new SimpleNotification("Your Order has been Placed");
         notification = new TimeStampNotificationDecorator(notification);
         notification = new SignatureDecorator(notification);
         NotificationService notificationService = NotificationService.getInstance();
         IObserver loggerObserver = new Logger(notificationService);
         NotificationEngine notificationEngine = new NotificationEngine(notificationService);

         INotificationStrategy emailstrategy = new Email();
         INotificationStrategy smsStrategy = new SMS();
         INotificationStrategy popUpStrategy = new Popup();
         notificationEngine.addStrategy(emailstrategy);
         notificationEngine.addStrategy(smsStrategy);
         notificationEngine.addStrategy(popUpStrategy);
         notificationService.notifyy(notification);

    }
}
