package Factory_Pattern;

public class Push implements INotification{
    public void send(){
        System.out.println("Notified through Push");
    }
}
