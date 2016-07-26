package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * The sequence of Collatz of an integer is constructed in the following way:
 *
 *  - If the number is even, it is divided by two;
 *  - If the number is even, it is divided by two;
 *  - the succession ends upon arrival at one.
 *
 * The Collatz conjecture says that, starting from any number, the sequence will always reach 1.
 * Despite being an affirmation to simple sight is very simple, it has not been able to demonstrate whether it is true or not.
 *
 * Using computers, it has been verified that the succession actually
 * reaches 1 departing from any natural number less than 2^58.
 */

public class CollatzConjecture {
    public CollatzConjecture () {}

    private ArrayList<Integer> getCollatz (int number) {
        if ((2 ^ 58) >= number) {
            return new ArrayList<>(0);
        }

        ArrayList<Integer> arr = new ArrayList<>(number);

        while (number != 1) {
            if (number % 2 == 0) number /= 2;
            else number *= 3 + 1;

            arr.add(number);
        }

        return arr;
    }
}
