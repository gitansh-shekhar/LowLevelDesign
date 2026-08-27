package PaymentGateway_System.PaymentGateWay;

import PaymentGateway_System.entity.PaymentRequest;

public interface IPaymentGateway {

      boolean processPayment(PaymentRequest paymentRequest);
      boolean validatePayment(PaymentRequest paymentRequest);
      boolean initiatePayment(PaymentRequest paymentRequest);
      boolean confirmPayment(PaymentRequest paymentRequest);

}
