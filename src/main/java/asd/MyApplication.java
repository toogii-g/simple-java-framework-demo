package asd;

import asd.Event.CustomEvent;
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


//	@Autowired
//	private MyServiceOne myServiceOne;
//	@Autowired
//	private MyScheduledService myScheduledService;
//	@Autowired
//	private ApplicationEventPublisher eventPublisher;
//	@Autowired
//	@Qualifier("stripePaymentService")
//	private static PaymentService paymentService;
//	@Autowired
//	private MyServiceOne iService;
//	@Autowired
//	private EmailService emailService;
//
//	@Autowired
//	AppConfig appConfig;
//	@Autowired
//	private ITestConstructor testConstrcutor;


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
	public static void main(String[] args) throws Exception{
		SimpleJavaFrameworkContext context = SimpleJavaFramework.run(MyApplication.class, args);

//		// Schedule tasks using the Scheduler
//		Scheduler scheduler = new Scheduler();
//		context.getBean(MyServiceOne.class).print(); // Example usage of getBean
//
//		DevService devService = context.getBean(DevService.class);
//		ProdService prodService = context.getBean(ProdService.class);

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
//		// Use getBean to get MyScheduledService and schedule it
		MyScheduledService scheduledService = context.getBean(MyScheduledService.class);
		//scheduler.schedule(scheduledService);

		// Initialize event publisher
		ApplicationEventPublisher eventPublisher = context.getEventPublisher();

		// Publish a custom event
		eventPublisher.publishEvent(new CustomEvent("Hello from Custom Event!"));
		paymentService.processPayment();

		// Keep the application running to observe scheduled tasks
		//Thread.currentThread().join();

		// Ensure scheduler shutdown is called on application exit
		Runtime.getRuntime().addShutdownHook(new Thread(scheduler::shutdown));



}

	@Override
	public void run(String... args) throws Exception {

//		//myServiceOne.print();
//		//System.out.println(Arrays.toString(args));
//		iService.print();
//		System.out.println(Arrays.toString(args));
//
//		System.out.println(appConfig.toString());
//
//		emailService.sendEmail();
//		System.out.println("Main thread finished: " + Thread.currentThread().getName());
//		//testConstrcutor.test();
//		System.out.println("Anoj");
		iContactService.addContact("012-345-678", "johndoe@miu.edu");
		iCustomerService.addCustomer("John", "Dow");

		advertisementService.print();
		System.out.println(Arrays.toString(args));


		iContactService.addContact("012-345-678", "johndoe@miu.edu");


		//emailService.sendEmail();
		System.out.println("Main thread finished: " + Thread.currentThread().getName());

	}
}
