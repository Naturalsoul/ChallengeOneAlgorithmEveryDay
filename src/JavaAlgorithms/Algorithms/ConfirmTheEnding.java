package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Check if a string (first argument, str) ends with the given target string (second argument, target).
 *
 * "Never give up and good luck will find you."
 * -- Falcor
 */

public class ConfirmTheEnding {
    public ConfirmTheEnding () {}

    private boolean isTheEnding (String str, String target) {
        if (str.length() < 1) return false;

        String[] arr = str.split(" ");

        return arr[arr.length - 1].equals(target);
    }

    public void showAlg (Scanner reader) {
        String str, target;

        System.out.println("\nChecks if a string (first argument) ends with the given target string (second argument).");
        System.out.print("Enter a sentence: ");
        reader.nextLine();

        str = reader.nextLine();

        System.out.print("Enter the word of ending: ");

        target = reader.nextLine();

        System.out.println("\nResult: " + this.isTheEnding(str, target));
    }
}
