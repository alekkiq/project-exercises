package Module1_1;

import java.util.LinkedList;
import java.util.Scanner;

/*
 *   Orientation tasks
 *       Module 1.1, Task 5
 */
public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        this.queue.addFirst(customer);
    }

    public Customer removeFromQueue() {
        Customer c = this.queue.getLast();
        c.setEndTime(System.nanoTime());
        this.queue.removeLast();

        return c;
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public long getTimeDiff(long s, long e) {
        return e - s;
    }

    public void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serve() {
        // randomize serving time between 1s - 10s
        long minTime = 1_000;
        long maxTime = 10_000;
        long serveTime = minTime + (long)((maxTime - minTime + 1) * Math.random());

        sleep(serveTime);
        Customer servedC = this.removeFromQueue();

        System.out.println("Served customer " + servedC.getId() + " in " + (serveTime / 1_000) + "s. Response time: " + servedC.getTimeSpent() + "s. Customers left: " + getQueueLength());
    }

    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator gen = new CustomerGenerator(sp);
        gen.generate(20);

        System.out.println("Queue size: " + sp.getQueueLength());

        while (sp.getQueueLength() > 0) {
            sp.serve();
        }

        // this is not really representative, since all the customers
        // are added to the queue simultaneously, leading to predictable
        // serving times.
    }
}
