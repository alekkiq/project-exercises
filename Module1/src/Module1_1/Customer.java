package Module1_1;

/*
*   Orientation tasks
*       Module 1.1, Task 3
*/
public class Customer {
    private static int customerCount = 0;

    private int id;
    private long startTime; // time when entering the queue
    private long endTime;

    public Customer(long startTime) {
        this.id = ++customerCount;
        this.startTime = startTime;
        // this.endTime = endTime;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    // Setters
    public void setStartTime(long time) {
        this.startTime = time;
    }

    public void setEndTime(long time) {
        this.endTime = time;
    }

    public long getTimeSpent() {
        return (this.endTime - this.startTime) / 1_000_000_000;
    }
}
