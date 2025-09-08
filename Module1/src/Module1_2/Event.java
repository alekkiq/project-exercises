package Module1_2;

import Module1_2.EventType;

public class Event implements Comparable<Event> {
    private EventType type;
    private long time; // in nanoseconds

    public Event(EventType type, long time) {
        this.type = type;
        this.time = time;
    }

    public EventType getType() {
        return this.type;
    }

    public long getTime() {
        return this.time;
    }

    @Override
    public int compareTo(Event e) {
        return Long.compare(this.time, e.time);
    }

    @Override
    public String toString() {
        return "Event Type: " + this.type + ", time: " + this.time;
    }
}
