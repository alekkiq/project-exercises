package Module1_3;

/*
 *   Orientation tasks
 *       Module 1.3, Task 2
 */
public class AgeDistribution {
    public static void main(String[] args) {
        final int NUM_SAMPLES = 1000;
        final int OLDEST_AGE = 35;

        // Each entry: {max random value, corresponding age}
        int[][] ageRanges = {
            {10, 20},
            {22, 21},
            {37, 22},
            {68, 23},
            {82, 24},
            {86, 25},
            {91, 26},
            {92, 28},
            {95, 30},
            {96, 31},
            {96, 32},
            {98, 33},
            {99, 34},
            {100, OLDEST_AGE},
        };

        int[] ageCounts = new int[OLDEST_AGE + 1];

        // Simulate age generation
        for (int i = 0; i < NUM_SAMPLES; i++) {
            int randValue = (int) (Math.random() * 100) + 1;
            for (int[] range : ageRanges) {
                if (randValue <= range[0]) {
                    ageCounts[range[1]]++;
                    break;
                }
            }
        }

        // Print results
        System.out.println("Age   Count     Percent");
        for (int age = 0; age <= OLDEST_AGE; age++) {
            if (ageCounts[age] > 0) {
                System.out.printf("%-5d %-9d %-8.2f", age, ageCounts[age], (ageCounts[age] * 100.0) / NUM_SAMPLES);
            }
        }
    }
}
