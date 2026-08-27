package Notification_System;

import java.util.ArrayList;

public class NotificationEngine implements IObserver{
    NotificationService notificationService;
    NotificationObservable notificationObservable;
    private ArrayList<INotificationStrategy> list;
    NotificationEngine(NotificationService notificationService){
        this.notificationService = notificationService;
        notificationObservable = (NotificationObservable) notificationService.getObservable();
        notificationObservable.add(this);
        list = new ArrayList<>();
    }
    @Override
    public void update(INotification notification) {
          for(INotificationStrategy strategy : list){
              strategy.sendNotification(notification);
          }
    }

    public void addStrategy(INotificationStrategy strategy){
        getList().add(strategy);

    }
    public void removeStrategy(INotificationStrategy strategy){
       if(list.contains(strategy)) list.remove(strategy);
    }

    public ArrayList<INotificationStrategy> getList() {
        return list;
    }

    public void setList(ArrayList<INotificationStrategy> list) {
        this.list = list;
    }
}
