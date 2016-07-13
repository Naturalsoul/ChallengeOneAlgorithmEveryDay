package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Truncates a string (first argument) if it is longer than the given maximum
 * string length (second argument). Returns the truncated string with a ... ending.
 *
 * Note that inserting the three dots to the end will add to the string length.
 *
 * However, if the given maximum string length num is less than or equal to 3, then
 * the addition of the three dots does not add to the string length in determining the truncated string.
 */

public class TruncateAString {
    public TruncateAString () {}

    private String getAStringTruncated (String str, int num) {
        if (num < 1 || str.length() <= num) return str;

        str = str.substring(0, num - 3);
        str = str.concat("...");

        return str;
    }

    public void showAlg (Scanner reader) {
        String str;
        int num;

        System.out.println("\nTruncates a string (first argument) if it is longer than the");
        System.out.println("given maximum string length (second argument). Return the truncated string with a ... ending.");

        System.out.print("\nEnter a sentence: ");
        reader.nextLine();

        str = reader.nextLine();

        System.out.print("Enter the number of character you want to keep: ");
        reader.nextLine();

        try {
            num = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            num = 0;
        }

        System.out.println("\nResult:");
        System.out.println(this.getAStringTruncated(str, num));
    }
}
