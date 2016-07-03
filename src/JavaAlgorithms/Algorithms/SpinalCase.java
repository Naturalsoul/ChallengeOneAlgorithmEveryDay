package JavaAlgorithms.Algorithms;

/**
 * Converts a string to spinal case. Spinal case is all-lowercase-words-joined-by-dashes.
 */

public class SpinalCase {
    public SpinalCase () {}

    private String getSpinalCaseString (String sentence) {
        if (sentence.length() < 3) return "Enter a sentence, pls.";

        sentence = sentence.replaceAll("\\s", "-").replaceAll("_", "-").toLowerCase();
        return sentence;
    }


}
