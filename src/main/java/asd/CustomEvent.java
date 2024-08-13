package asd;

import framework.event.Event;

public class CustomEvent extends Event {
    private final String message;

    public CustomEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}