package JavaAlgorithms.Algorithms;

import java.util.Collections;
import java.util.Scanner;

/**
 * Repeats a given string (first argument) num times (second argument).
 * Returns an empty string if num is not a positive number.
 */

public class RepeatAStringRepeatAString {
    public RepeatAStringRepeatAString () {}

    private String repeatThis (String str, int howManyTimes) {
        if (howManyTimes < 0) {
            return "";
        }

        return new String(new char[howManyTimes]).replace("\0", str);
    }

    public void showAlg (Scanner reader) {
        System.out.println("\nRepeats a given string (first argument) num times (second argument).");
        System.out.println("Returns an empty string if num is not a positive number.");

        System.out.print("\nEnter a word: ");
        reader.nextLine();

        String str = reader.nextLine();

        System.out.print("How many times? : ");
        int times;

        try {
            times = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            times = 0;
        }

        System.out.println("\nResult:");
        System.out.println(this.repeatThis(str, times));
    }
}
