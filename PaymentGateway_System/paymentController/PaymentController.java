package PaymentGateway_System.paymentController;

import PaymentGateway_System.Enum.PaymentGateway;
import PaymentGateway_System.entity.PaymentRequest;
import PaymentGateway_System.paymentService.PaymentService;

public class PaymentController {
    public PaymentService paymentService = new PaymentService();
    private static PaymentController paymentController;
    private PaymentController(){};

    public static PaymentController getInstance(){
        if(paymentController == null){

            synchronized (PaymentController.class){
                if(paymentController == null){
                    paymentController = new PaymentController();
                }
            }
        }
        return paymentController;
    }
    public void pay(PaymentRequest paymentRequest , PaymentGateway pg ){
        paymentService.pay(paymentRequest , pg);
    }

}
