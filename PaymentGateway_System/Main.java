package PaymentGateway_System;

import PaymentGateway_System.Enum.PaymentGateway;
import PaymentGateway_System.entity.PaymentRequest;
import PaymentGateway_System.paymentController.PaymentController;

public class Main {
    public static void main(String[] args) {
        PaymentRequest paymentRequest1 = new PaymentRequest("Gitansh" ,"shekhar" , 1000 , "INR");

        PaymentController paymentController = PaymentController.getInstance();
        paymentController.pay(paymentRequest1 , PaymentGateway.PAYTM);

    }
}
