package PaymentGateway_System.factory;

import PaymentGateway_System.Enum.PaymentGateway;
import PaymentGateway_System.PaymentGateWay.IPaymentGateway;
import PaymentGateway_System.PaymentGateWay.PaymentGatewayProxy;
import PaymentGateway_System.PaymentGateWay.PaytmGateway;
import PaymentGateway_System.PaymentGateWay.RazorpayGateway;
import PaymentGateway_System.bankingSystem.BankingSystem;
import PaymentGateway_System.bankingSystem.PaytmBankingSystem;
import PaymentGateway_System.bankingSystem.RazorPayBankingSystem;
import PaymentGateway_System.entity.PaymentRequest;

public class GatewayFactory {

    public IPaymentGateway getInstance(PaymentGateway paymentGateway){
        if(paymentGateway == PaymentGateway.PAYTM){
            BankingSystem bankingSystem = new PaytmBankingSystem();
            IPaymentGateway paytmGateway = new PaytmGateway(bankingSystem);
            return new PaymentGatewayProxy(paytmGateway , 3);
        }
        else if(paymentGateway == PaymentGateway.RAZORPAY){
            BankingSystem bankingSystem = new RazorPayBankingSystem();
            IPaymentGateway razorpayGateway = new RazorpayGateway(bankingSystem);
            return new PaymentGatewayProxy(razorpayGateway , 2);
        }
        return null;
    }

}

