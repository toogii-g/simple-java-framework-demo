package asd;

import framework.annotation.Scheduled;
import framework.annotation.Service;

@Service
public class MyScheduledService {
    @Scheduled(fixedRate = 5000)
    public void performTask() {
        System.out.println("Scheduled task executed at: " + System.currentTimeMillis());
    }

    @Scheduled(cron = "5 0") // Run every 5 seconds
    public void taskEvery5Seconds() {
        System.out.println("Task running every 5 seconds");
    }

    @Scheduled(cron = "5 1") // Run every 1 minute and 5 seconds
    public void taskEvery65Seconds() {
        System.out.println("Task running every 65 seconds");
    }

    @Scheduled(cron = "7 5") // Run every 5 minutes and 7 seconds
    public void taskEvery307Seconds() {
        System.out.println("Task running every 307 seconds");
    }
}
