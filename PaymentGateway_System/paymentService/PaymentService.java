package PaymentGateway_System.paymentService;

import PaymentGateway_System.Enum.PaymentGateway;
import PaymentGateway_System.PaymentGateWay.IPaymentGateway;
import PaymentGateway_System.entity.PaymentRequest;
import PaymentGateway_System.factory.GatewayFactory;

public class PaymentService {
    GatewayFactory gatewayFactory = new GatewayFactory();
    IPaymentGateway paymentGateway;
    public void pay(PaymentRequest paymentRequest , PaymentGateway pg){
        if(pg == PaymentGateway.PAYTM){
            paymentGateway = gatewayFactory.getInstance(pg );

        }
        else if(pg == PaymentGateway.RAZORPAY){
            paymentGateway = gatewayFactory.getInstance(pg);
        }
        paymentGateway.processPayment(paymentRequest);
    }
}
