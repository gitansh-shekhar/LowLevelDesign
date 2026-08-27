package PaymentGateway_System.bankingSystem;

import PaymentGateway_System.entity.PaymentRequest;

public interface BankingSystem {

     boolean processPayment(PaymentRequest paymentRequest);
}
