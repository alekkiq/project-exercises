package Module1_3.Task7;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.ARRIVAL);
        ServicePoint servicePoint = new ServicePoint();

        // generate arrivals
        ArrivalProcess.generateArrivals(eventList, arrivalProcess, 10);

        // print event list
        System.out.println("Initial Event List:");
        eventList.printEvents();
        System.out.println(eventList.getEvents().size());
        System.out.println();

        // time after arrivals
        System.out.println("Time after arrivals: " + clock.getTime());
        System.out.println();

        // process events -> add to service point
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(eventList.getEvents());
        while (!tempQueue.isEmpty()) {
            Event event = tempQueue.poll();
            Customer customer = new Customer(event.getTime());
            servicePoint.addToQueue(customer);
            System.out.println("Customer " + customer.getId() + " arrived at " + customer.getStartTime());
        }

        // advance clock
        System.out.println("Time: " + clock.getTime());

        // clear service point and print total time
        while (servicePoint.getQueueLength() > 0) {
            servicePoint.serve();
        }

    }
}
