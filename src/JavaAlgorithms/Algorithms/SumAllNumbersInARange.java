package JavaAlgorithms.Algorithms;

import java.util.Scanner;

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

    private void showAlg (Scanner reader) {
        int[] range = new int[2];

        System.out.println("\nReturns the sum of those two numbers and all numbers between them.");
        System.out.print("\nEnter the first number: ");
        reader.nextLine();

        try {
            range[0] = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            range[0] = 0;
        }

        System.out.print("Enter the second number: ");
        reader.nextLine();

        try {
            range[1] = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            range[1] = 0;
        }

        System.out.println("\nResult: " + this.getSum(range));
    }
}
