package Notification_System;

public class NotificationService {
    private  static NotificationService notificationService;
    private IObservable observable;
    private NotificationService(){
        this.observable = new NotificationObservable();
    };

    public static NotificationService getInstance(){

        if(notificationService==null){
            synchronized (NotificationService.class){
                if(notificationService==null){
                    notificationService = new NotificationService();
                }
            }
        }
        return notificationService;
    }
    public  void notifyy(INotification notification){
         observable.notifyy(notification);
    }

    public IObservable getObservable() {
        return observable;
    }

    public void setObservable(IObservable observable) {
        this.observable = observable;
    }
}
