package PaymentGateway_System.bankingSystem;

import PaymentGateway_System.entity.PaymentRequest;

public class PaytmBankingSystem implements BankingSystem{
    @Override
    public boolean processPayment(PaymentRequest paymentRequest) {

        int rand =(int) (Math.random()*100);
        if(rand>30){
            System.out.println("Main Yanha hu");
            return true;
        }
        else return false;
    }
}
