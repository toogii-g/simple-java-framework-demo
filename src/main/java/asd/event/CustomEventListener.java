package asd.event;

public class CustomEventListener  {

    //@EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Received event: " + event.getMessage());
    }
}