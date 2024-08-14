package asd;

import framework.annotation.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal");
    }
}