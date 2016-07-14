package JavaAlgorithms.Algorithms;

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
}
