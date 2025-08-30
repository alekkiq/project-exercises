package Module1_1;

import java.util.LinkedList;
import java.util.Scanner;

/*
 *   Orientation tasks
 *       Module 1.1, Task 4
 */
public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        this.queue.addFirst(customer);
    }

    public Customer removeFromQueue() {
        Customer c = this.queue.getLast();
        this.queue.removeLast();

        return c;
    }

    public void serve() {
        // randomize serving time between 1s - 10s
        long minTime = 1_000;
        long maxTime = 10_000;
        long serveTime = minTime + (long)((maxTime - minTime + 1) * Math.random());

        long start = System.nanoTime();

        Customer c = this.queue.getLast();


    }

    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint(new LinkedList<>());


    }
}
