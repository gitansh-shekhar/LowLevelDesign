package Factory_Pattern;

public class SMSFactory extends NotificationFactory{
    @Override
    public INotification generateNotification() {
        return new SMS();
    }
}
