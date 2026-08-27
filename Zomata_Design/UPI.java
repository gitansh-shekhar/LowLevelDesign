package Zomata_Design;

public class UPI implements PaymentProcessor{
    @Override
    public boolean pay(double amount) {
        System.out.println("Amount "+amount +" paid.");
        return true;
    }
}
