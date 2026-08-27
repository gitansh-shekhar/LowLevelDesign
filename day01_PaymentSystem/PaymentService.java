package day01_PaymentSystem;

public class PaymentService {
    PaymentProcessor paymentProcessor ;
    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    void doPayment(){
        paymentProcessor.pay();
    }

    public static void main(String[] args) {
         PaymentService upi = new PaymentService(new UPI_Processor());
         upi.doPayment();
         PaymentService card = new PaymentService(new Card_Processor());
         card.doPayment();
    }
}
