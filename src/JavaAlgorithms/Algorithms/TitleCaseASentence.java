package JavaAlgorithms.Algorithms;

/**
 * Return the provided string with the first letter of each word capitalized.
 */

public class TitleCaseASentence {
    public TitleCaseASentence () {}

    private String getTitleCased (String str) {
        if (str.length() < 1) return "";

        String[] arr = str.replaceAll("[\\W_]+", " ").split(" ");
        String newStr = "";

        for (String word : arr) {
            newStr += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }

        return newStr;
    }
}
