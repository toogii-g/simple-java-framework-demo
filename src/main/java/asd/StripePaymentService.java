package asd;

import framework.annotation.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Stripe");
    }
}