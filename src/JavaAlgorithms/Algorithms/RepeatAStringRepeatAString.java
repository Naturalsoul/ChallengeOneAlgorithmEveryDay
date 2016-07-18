package JavaAlgorithms.Algorithms;

import java.util.Collections;

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
}
