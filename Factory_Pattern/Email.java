package Factory_Pattern;

public class Email implements INotification{
    public void send(){
        System.out.println("Notified through Email");
    }
}
