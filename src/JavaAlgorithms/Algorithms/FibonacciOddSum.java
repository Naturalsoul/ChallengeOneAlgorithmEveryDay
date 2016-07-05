package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void showAlg (Scanner reader) {
        Integer number;

        System.out.println("\nReturns the sum of all odd Fibonacci numbers up to and including the passed number if it is a Fibonacci number.");
        System.out.println("As an example, passing 4 to the function should return 5 because all the odd Fibonacci numbers under 4 are 1, 1, and 3.");
        System.out.print("\nEnter a number: ");
        reader.nextLine();

        number = Integer.valueOf(reader.findInLine("[0-9]+"));

        if (number > 0)
            System.out.println("\nResult: " + this.getFiboOddSum(number));
        else
            System.out.println("\nResult: Enter a number greater than 0.");
    }
}
