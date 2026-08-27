package Factory_Pattern;

public class PushFactory extends NotificationFactory{
    @Override
    public INotification generateNotification() {
        return new Push();
    }
}
