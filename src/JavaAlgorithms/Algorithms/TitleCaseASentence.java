package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Returns the provided string with the first letter of each word capitalized.
 */

public class TitleCaseASentence {
    public TitleCaseASentence () {}

    private String getTitleCased (String str) {
        if (str.length() < 1) return "";

        String[] arr = str.split(" ");
        String newStr = "";

        for (String word : arr) {
            newStr += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }

        return newStr.trim();
    }

    public void showAlg (Scanner reader) {
        String str;

        System.out.println("\nReturns the provided string with the first letter of each word capitalized.");

        System.out.println("\nEnter a sentence: ");
        reader.nextLine();

        str = reader.nextLine();

        System.out.println("\nResult:");
        System.out.println(this.getTitleCased(str));
    }
}
