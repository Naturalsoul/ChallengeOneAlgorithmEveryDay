package JavaAlgorithms.Algorithms;

/**
 * Returns the sum of those two numbers and all numbers between them.
 */

public class SumAllNumbersInARange {
    public SumAllNumbersInARange () {}

    private int getSum (int[] range) {
        if (range[0] < 1 || range[1] < 1) return 0;

        int sum = 0;
        int min = Math.min(range[0], range[1]);
        int max = Math.max(range[0], range[1]);

        for (int i = min; i <= max; i++)
            sum += i;

        return sum;
    }
}
