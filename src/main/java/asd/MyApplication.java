package asd;

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
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	@Autowired
	@Qualifier("stripePaymentService")
	private static PaymentService paymentService;
	public static void main(String[] args) throws Exception{
		//SimpleJavaFrameworkContext context = SimpleJavaFramework.run(MyApplication.class, args);

//		// Schedule tasks using the Scheduler
//		Scheduler scheduler = new Scheduler();
//		context.getBean(MyServiceOne.class).print(); // Example usage of getBean
//
//		// Use getBean to get MyScheduledService and schedule it
//		MyScheduledService scheduledService = context.getBean(MyScheduledService.class);
//		scheduler.schedule(scheduledService);

		// Initialize event publisher
		//ApplicationEventPublisher eventPublisher = context.getEventPublisher();

		// Publish a custom event
		//eventPublisher.publishEvent(new CustomEvent("Hello from Custom Event!"));
		//paymentService.processPayment();
		// Keep the application running to observe scheduled tasks
		//Thread.currentThread().join();

		// Ensure scheduler shutdown is called on application exit
		//Runtime.getRuntime().addShutdownHook(new Thread(scheduler::shutdown));
		System.out.println("Anoj");

}

	@Override
	public void run(String... args) throws Exception {
		//myServiceOne.print();
		//System.out.println(Arrays.toString(args));
	}
}
