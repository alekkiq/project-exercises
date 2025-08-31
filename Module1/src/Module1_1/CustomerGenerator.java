package Module1_1;

/*
 *   Orientation tasks
 *       Module 1.1, Task 5
 */
public class CustomerGenerator {
    private ServicePoint target;

    public CustomerGenerator(ServicePoint sp) {
        this.target = sp;
    }

    public void generate(int count) {
        System.out.println("Creating a queue of " + count + "...");
        for (int i = 1; i <= count; i++) {
            this.target.addToQueue(new Customer(System.nanoTime()));
        }
        System.out.println("Success!");
    }
}
