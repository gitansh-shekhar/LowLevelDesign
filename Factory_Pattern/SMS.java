package Factory_Pattern;

public class SMS implements INotification{
    public void send(){
        System.out.println("Notified through SMS");
    }
}
