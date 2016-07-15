package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Returns the factorial of the provided integer.
 */

public class FactorializeANumber {
    public FactorializeANumber () {}

    private int getFactorial (int n) {
        if (n == 0) return 1;
        return n * getFactorial(n - 1);
    }

    public void showAlg (Scanner reader) {
        int n;

        System.out.println("\nReturns the factorial of the provided integer.");
        System.out.print("\nEnter a number: ");
        reader.nextLine();

        try {
            n = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            n = 0;
        }

        System.out.println("\nResult: " + this.getFactorial(n));
    }
}
