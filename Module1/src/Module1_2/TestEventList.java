package Module1_2;

import Module1_2.EventType;

public class TestEventList {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.addEvent(new Event(EventType.ARRIVAL, System.nanoTime() + 5000));
        list.addEvent(new Event(EventType.ARRIVAL, System.nanoTime() + 2000));
        list.addEvent(new Event(EventType.ARRIVAL, System.nanoTime() + 8000));

        System.out.println("Next event: " + list.getNextEvent());
        System.out.println();

        System.out.println("Remaining events in order:\n");
        list.printEvents();
    }
}
