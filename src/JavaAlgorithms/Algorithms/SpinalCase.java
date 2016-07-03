package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Converts a string to spinal case. Spinal case is all-lowercase-words-joined-by-dashes.
 * This is a very simple algorithm. Today, I don't feel sooo good and i decided to write an
 * easy algorithm. I hope I'll feel better soon.
 */

public class SpinalCase {
    public SpinalCase () {}

    private String getSpinalCaseString (String sentence) {
        if (sentence.length() < 3) return "Enter a sentence, pls.";

        sentence = sentence.replaceAll("\\s", "-").replaceAll("_", "-").toLowerCase();
        return sentence;
    }

    public void showAlg (Scanner reader) {
        System.out.println("\nConverts a string to spinal case. Spinal case is all-lowercase-words-joined-by-dashes.");
        System.out.println("Enter a sentence:");
        reader.nextLine();

        String sentence = reader.nextLine();

        System.out.println("\nResult: " + this.getSpinalCaseString(sentence));
    }
}
