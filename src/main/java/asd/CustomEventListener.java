package asd;

import framework.event.EventListener;

public class CustomEventListener implements EventListener<CustomEvent> {

    @Override
    public void onEvent(CustomEvent event) {
        System.out.println("Custom Event Received: " + event.getMessage());
    }
}