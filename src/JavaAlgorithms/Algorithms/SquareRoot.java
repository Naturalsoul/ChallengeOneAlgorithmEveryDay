package JavaAlgorithms.Algorithms;

import java.util.Scanner;

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

        while (number > 0) {
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

    public void showAlg (Scanner reader) {
        int number;

        System.out.println("\nThis allows to calculate approximately the square root of a number.");
        System.out.print("Enter a number: ");
        reader.nextLine();

        try {
            number = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            number = 1;
        }

        String[] result = this.getSquareRoot(number);

        System.out.println("\nResult: The number " + number + " has " + result[0] + " of " + result[1]);
    }
}
