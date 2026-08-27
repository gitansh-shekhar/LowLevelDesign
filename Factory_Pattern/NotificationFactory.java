package Factory_Pattern;

public abstract class NotificationFactory {
    abstract protected INotification generateNotification();
    void notifyUser(){
        INotification type = generateNotification();
        type.send();
    }

}
