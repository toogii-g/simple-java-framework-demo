package asd;

import asd.event.CustomEvent;
import asd.service.IContactService;
import asd.service.ICustomerService;
import framework.*;
import framework.annotation.Autowired;
import framework.annotation.Qualifier;
import framework.event.ApplicationEventPublisher;
import framework.util.Runnable;
import framework.util.Scheduler;

import java.util.Arrays;


public class MyApplication implements Runnable {

    @Autowired
    private AdvertisementService advertisementService;
    @Autowired
    private MyScheduledService myScheduledService;
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    @Autowired
    @Qualifier("stripePaymentService")
    private static PaymentService paymentService;
    @Autowired
    private EmailService emailService;

    @Autowired
    private IContactService iContactService;
    @Autowired
    private ICustomerService iCustomerService;

    public static void main(String[] args) throws Exception {
        SimpleJavaFrameworkContext context = SimpleJavaFramework.run(MyApplication.class, args);

        // Schedule tasks using the Scheduler
        Scheduler scheduler = new Scheduler();
        context.getBean(AdvertisementService.class).print(); // Example usage of getBean

        DevService devService = context.getBean(DevService.class);
        ProdService prodService = context.getBean(ProdService.class);

        if (devService != null) {
            devService.print(); // Should print "Development Service" if profile is "dev"
        }
        if (prodService != null) {
            prodService.print(); // Should not be available if profile is "dev"
        }
        MyScheduledService scheduledService = context.getBean(MyScheduledService.class);

        // Initialize event publisher
        ApplicationEventPublisher eventPublisher = context.getEventPublisher();

        // Publish a custom event
        eventPublisher.publishEvent(new CustomEvent("Hello from Custom Event!"));
        paymentService.processPayment();

        // Ensure scheduler shutdown is called on application exit
        Runtime.getRuntime().addShutdownHook(new Thread(scheduler::shutdown));


    }

    @Override
    public void run(String... args) throws Exception {

        iContactService.addContact("012-345-678", "johndoe@miu.edu");
        iCustomerService.addCustomer("John", "Dow");

        advertisementService.print();
        System.out.println(Arrays.toString(args));

        iContactService.addContact("012-345-678", "johndoe@miu.edu");

        System.out.println("Main thread finished: " + Thread.currentThread().getName());

    }
}
