package asd.Event;
import framework.annotation.EventListener;
import framework.annotation.Service;

public class CustomEventListener  {

    //@EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Received event: " + event.getMessage());
    }
}