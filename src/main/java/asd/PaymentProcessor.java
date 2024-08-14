package asd;

import framework.annotation.Autowired;
import framework.annotation.Qualifier;
import framework.annotation.Service;

@Service
public class PaymentProcessor {
    @Autowired
    @Qualifier("StripePaymentService")
    private PaymentService paymentService;

    public void process() {
        paymentService.processPayment();
    }
}
