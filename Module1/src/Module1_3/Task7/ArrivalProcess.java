package Module1_3.Task7;

import eduni.distributions.Normal;

public class ArrivalProcess {
    private Normal rng;
    private EventType eventType;

    public ArrivalProcess(EventType eventType) {
        this.eventType = eventType;
        this.rng = new Normal(50.0, 10.0, 123); // fixed values
    }

    public void addArrival(EventList eventList) {
        Clock clock = Clock.getInstance();
        double interval = rng.sample();
        double eventTime = clock.getTime() + interval;
        clock.advanceTime((long) eventTime);
        eventList.addEvent(new Event(this.eventType, (long)eventTime));
    }

    public static void generateArrivals(EventList el, ArrivalProcess ap, int n) {
        for (int i = 0; i < n; i++) {
            ap.addArrival(el);
        }
    }
}
