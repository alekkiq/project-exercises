package Module1_3;

/*
 *   Orientation tasks
 *       Module 1.3, Task 5
 */
public class Clock {
    private static Clock instance = null;
    private double time;

    private Clock() {
        this.time = 0.0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }

        return instance;
    }

    public double getTime() {
        return this.time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void advanceTime(double step) {
        this.time += step;
    }
}
