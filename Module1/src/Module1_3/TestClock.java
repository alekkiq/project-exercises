package Module1_3;

public class TestClock {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Initial time: " + clock.getTime());

        clock.advanceTime(5.0);
        System.out.println("After advancing by 5.0: " + clock.getTime());

        clock.setTime(10.0);
        System.out.println("After setting time to 10.0: " + clock.getTime());

        clock.advanceTime(2.5);
        System.out.println("After advancing by 2.5: " + clock.getTime());
    }
}
