package Factory_Pattern;

public class EmailFactory extends NotificationFactory{
    @Override
    public INotification generateNotification() {
        return new Email();
    }
}
