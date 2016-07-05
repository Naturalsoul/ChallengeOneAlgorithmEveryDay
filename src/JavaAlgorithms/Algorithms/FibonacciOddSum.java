package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * Returns the sum of all odd Fibonacci numbers up to and including the passed number if it is a
 * Fibonacci number.
 * As an example, passing 4 to the function should return 5 because all the odd Fibonacci numbers
 * under 4 are 1, 1, and 3.
 */

public class FibonacciOddSum {
    private ArrayList<Integer> fibo = new ArrayList<>();

    public FibonacciOddSum () {
        fibo.add(1);
        fibo.add(1);

        for (int i = 1; i < 31; i++) {
            fibo.add(fibo.get(i - 1) + fibo.get(i));
        }
    }

    private int getFiboOddSum (int number) {
        int sum = 0;

        for (Integer aFibo : fibo) {
            if (aFibo <= number && aFibo % 2 > 0) {
                sum += aFibo;
            }
        }

        return sum;
    }
}
