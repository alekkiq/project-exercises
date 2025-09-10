package Module1_3.Task7;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events;

    public EventList() {
        this.events = new PriorityQueue<>();
    }

    public PriorityQueue<Event> getEvents() {
        return this.events;
    }

    public void addEvent(Event e) {
        this.events.add(e);
    }

    public Event getNextEvent() {
        return this.events.poll();
    }

    public boolean isEmpty() {
        return this.events.isEmpty();
    }

    public int size() {
        return this.events.size();
    }

    public void printEvents() {
        PriorityQueue<Event> queueCopy = new PriorityQueue<>(this.events);

        while (!queueCopy.isEmpty()) {
            System.out.println(queueCopy.poll());
        }
    }
}
