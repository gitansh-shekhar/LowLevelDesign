package day01_PaymentSystem;

public class Card_Processor implements PaymentProcessor {
    @Override
    public void pay(){
        System.out.println("Paying using Card");
    }
}
