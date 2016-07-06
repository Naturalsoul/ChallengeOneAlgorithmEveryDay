package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * Sum all the prime numbers up to and including the provided number.
 */

public class SumAllPrimes {
    public SumAllPrimes () {}

    private boolean isPrime (int number) {
        boolean isAPrimeNumber = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) isAPrimeNumber = false;
        }

        return isAPrimeNumber;
    }

    private int getPrimeSum (int number) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (Integer i = 0; i <= number; i++) {
            arr.add(i);
        }

        for (Integer n : arr) {
            if (this.isPrime(n)) {
                sum += n;
            }
        }

        return sum;
    }
}
