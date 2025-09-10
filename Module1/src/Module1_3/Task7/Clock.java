package Module1_3.Task7;

public class Clock {
    private static Clock instance = null;
    private long time;

    private Clock() {
        this.time = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }

        return instance;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void advanceTime(long step) {
        this.time += step;
    }
}
