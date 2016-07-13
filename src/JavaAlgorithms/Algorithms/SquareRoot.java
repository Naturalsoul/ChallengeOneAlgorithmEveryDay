package JavaAlgorithms.Algorithms;

/**
 * This allows to calculate approximately the square root of a number according to the following procedure:
 *
 *  - It takes the initial number and subtracts the first odd number (one), this result is subtracts the next
 *  odd number and so on until the result of the subtraction is less than or equal to zero.
 *
 *  - If the final result is equal to zero is treated in a number with whole root and will be given by the number
 *  of times that became the subtraction, including zero.
 *
 *  - If the result is less than zero, the number has no root perfect and the approximate result (truncated) shall
 *  be given by the number of times that became the subtraction minus one.
 */

public class SquareRoot {
    public SquareRoot () {}

    private String[] getSquareRoot (int number) {
        int oddNumbers = 1;
        int p = 0;
        String[] result = new String[2];

        while (number <= 0) {
            number -= oddNumbers;
            oddNumbers += 2;
            p++;
        }

        if (number > -1) {
            result[0] = "Perfect root";
        } else {
            result[0] = "Not perfect root";
        }

        result[1] = String.valueOf(p);

        return result;
    }
}
