package PaymentGateway_System.PaymentGateWay;

import PaymentGateway_System.entity.PaymentRequest;

public class PaymentGatewayProxy implements IPaymentGateway{
    private int retryCount;
    private IPaymentGateway paymentGateway;
    public PaymentGatewayProxy(IPaymentGateway paymentGateway , int retryCount){
        this.paymentGateway = paymentGateway;
        this.retryCount = retryCount;
    }


    @Override
    public boolean processPayment(PaymentRequest paymentRequest) {
         for(int i=0; i<retryCount; i++){
             if(paymentGateway.processPayment(paymentRequest)){
                 return true;
             }
         }
         return false;
    }

    @Override
    public boolean validatePayment(PaymentRequest paymentRequest) {
      return    paymentGateway.validatePayment(paymentRequest);
    }

    @Override
    public boolean initiatePayment(PaymentRequest paymentRequest) {
        return paymentGateway.initiatePayment(paymentRequest);
    }

    @Override
    public boolean confirmPayment(PaymentRequest paymentRequest) {
       return paymentGateway.confirmPayment(paymentRequest);
    }
}
