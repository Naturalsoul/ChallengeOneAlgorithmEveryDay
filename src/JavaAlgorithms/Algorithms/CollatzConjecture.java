package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The sequence of Collatz of an integer is constructed in the following way:
 *
 *  - If the number is even, it is divided by two;
 *  - If is odd, it multiplies three and adds one;
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
        if (number >= (2 ^ 58) || number == 0) {
            return new ArrayList<>(0);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while (number != 1) {
            if (number % 2 == 0) number /= 2;
            else number = (number * 3) + 1;
            arr.add(number);
        }

        return arr;
    }

    public void showAlg (Scanner reader) {
        int number;
        ArrayList<Integer> arr;
        String result = "";

        System.out.println("\nThe sequence of Collatz of an integer is constructed in the following way:");
        System.out.println("- If the number is even, it is divided by two;");
        System.out.println("- If is odd, it multiplies three and adds one;");
        System.out.println("- the succession ends upon arrival at one.");

        System.out.println("\nThe Collatz conjecture says that, starting from any number, the sequence will always reach 1.");
        System.out.println("Despite being an affirmation to simple sight is very simple, it has not been able to demonstrate whether it is true or not.");

        System.out.println("\nUsing computers, it has been verified that the succession actually");
        System.out.println("reaches 1 departing from any natural number less than 2^58.");

        System.out.print("\nEnter a number bellow than 2^58: ");
        reader.nextLine();

        try {
            number = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            number = 0;
        }

        System.out.println("\nResult:");

        arr = this.getCollatz(number);

        for (Integer n : arr) {
            result += n + " ";
        }

        System.out.println(number + " " + result);
    }
}
