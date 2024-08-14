package asd;

import framework.annotation.Autowired;
import framework.annotation.Qualifier;

public class PaymentProcessor {
    @Autowired
    @Qualifier("StripePaymentService")
    private PaymentService paymentService;

    public void process() {
        paymentService.processPayment();
    }
}
