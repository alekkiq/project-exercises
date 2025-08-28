package Module1_1;

import java.util.LinkedList;
import java.util.Scanner;

/*
 *   Orientation tasks
 *       Module 1.1, Task 4
 */
public class CustomerQueue {
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Customer> queue = new LinkedList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Customer queue (size: " + queue.size() + ")\nSelect\n1 - add customer\n2 - serve customer\n3 - quit\n");

            int ans = scanner.nextInt();

            switch (ans) {
                case 1:
                    Customer newC = new Customer(System.nanoTime());
                    queue.addFirst(newC);

                    sleep(500);

                    System.out.println("Added Customer (id " + newC.getId() + ") to queue");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No customers to serve");
                    } else {
                        sleep(1000);
                        Customer removedC = queue.getLast();
                        removedC.setEndTime(System.nanoTime());
                        queue.removeLast();
                        System.out.println("Customer id " + removedC.getId() + " served, time spent (s): " + removedC.getTimeSpent());
                    }
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Select 1, 2 or 3");
            }
        }
    }
}
