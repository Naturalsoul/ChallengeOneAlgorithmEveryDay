package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sums all the prime numbers up to and including the provided number.
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
        if (number < 2) return 0;

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

        return sum - 1;
    }

    public void showAlg (Scanner reader) {
        int number;

        System.out.println("\nSums all the prime numbers up to and including the provided number.");
        System.out.print("Enter a number: ");
        reader.nextLine();

        try {
            number = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            number = 0;
        }

        System.out.println("\nResult: " + this.getPrimeSum(number));
    }
}
