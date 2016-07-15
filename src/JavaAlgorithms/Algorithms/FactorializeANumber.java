package JavaAlgorithms.Algorithms;

/**
 * Returns the factorial of the provided integer.
 */

public class FactorializeANumber {
    public FactorializeANumber () {}

    private int getFactorial (int n) {
        if (n == 0) return 1;
        return getFactorial(n - 1);
    }
}
