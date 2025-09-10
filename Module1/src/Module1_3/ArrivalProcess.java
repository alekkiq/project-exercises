package Module1_3;

import java.util.List;
import java.util.ArrayList;

import Module1_2.EventList;
import eduni.distributions.Normal;
import Module1_2.Event;
import Module1_2.EventType;

/*
 *   Orientation tasks
 *       Module 1.3, Task 6
 */
public class ArrivalProcess {
    private Normal rng;
    private EventType eventType;

    public ArrivalProcess(EventType eventType) {
        this.eventType = eventType;
        this.rng = new Normal(50.0, 10.0, 123); // standard deviation fixed at 10.0
    }

    public void addArrival(List<Event> eventList, double currentTime) {
        double interval = rng.sample();
        double eventTime = currentTime + interval;
        eventList.add(new Event(this.eventType, (long)eventTime));
    }

    // Test program
    public static void main(String[] args) {
        List<Event> eventList = new ArrayList<>();
        ArrivalProcess ap = new ArrivalProcess(EventType.ARRIVAL);
        double clock = 0.0;

        for (int i = 0; i < 10; i++) {
            ap.addArrival(eventList, clock);
            clock = eventList.get(eventList.size() - 1).getTime(); // move clock to new event time
        }

        for (Event event : eventList) {
            System.out.println(event);
        }
    }
}
