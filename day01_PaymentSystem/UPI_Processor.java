package day01_PaymentSystem;

public class UPI_Processor implements PaymentProcessor {
    @Override
    public void pay() {
        System.out.println("paying using UPI");
    }
}
