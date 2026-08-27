package PaymentGateway_System.PaymentGateWay;

import PaymentGateway_System.bankingSystem.BankingSystem;
import PaymentGateway_System.entity.PaymentRequest;

public class RazorpayGateway implements IPaymentGateway{

    BankingSystem bankingSystem;
    public RazorpayGateway(BankingSystem bankingSystem){
        this.bankingSystem = bankingSystem;
    }
    @Override
    public boolean processPayment(PaymentRequest paymentRequest) {

        boolean validate = validatePayment(paymentRequest);
        if(!validate)return false;
        boolean initiate = initiatePayment(paymentRequest);
        if(!initiate)return false;
        boolean confirm = confirmPayment(paymentRequest);
        if(!confirm)return false;
        return true;

    }

    @Override
    public boolean validatePayment(PaymentRequest paymentRequest) {
        if(paymentRequest.getSender()!=null && paymentRequest.getReciever()!=null && paymentRequest.getAmount()>0){
            System.out.println("1. Validation successful........");
            return true;
        }
        else {
            System.out.println("Validation failed.");
            return false;
        }
    }

    @Override
    public boolean initiatePayment(PaymentRequest paymentRequest) {
        System.out.println("2. Payment Initiated by Razorpay:");
        return true;
    }

    @Override
    public boolean confirmPayment(PaymentRequest paymentRequest) {
        if(bankingSystem.processPayment(paymentRequest)){
            System.out.println("Payment of amount "+paymentRequest.getAmount()+" successful.");
            return true;
        }
        else {
            System.out.println("Payment validation failed");
            return false;
        }
    }
}
