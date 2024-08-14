package asd;

import framework.annotation.Async;
import framework.annotation.Service;

@Service
public class EmailService {

    @Async
    public void sendEmail() {
        System.out.println("Sending email... " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);  // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email sent! " + Thread.currentThread().getName());
    }
}