package Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notifier ;
        notifier = new SMSFactory();
        notifier.notifyUser();
        notifier  = new EmailFactory();
        notifier.notifyUser();
        notifier = new PushFactory();
        notifier.notifyUser();

    }
}
