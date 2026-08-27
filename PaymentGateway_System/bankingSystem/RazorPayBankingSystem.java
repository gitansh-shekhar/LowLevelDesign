package PaymentGateway_System.bankingSystem;

import PaymentGateway_System.entity.PaymentRequest;

public class RazorPayBankingSystem implements BankingSystem{
    @Override
    public boolean processPayment(PaymentRequest paymentRequest) {
        int rand =(int) (Math.random()*100);
        if(rand>=50){
            return true;
        }
        return false;
    }
}
