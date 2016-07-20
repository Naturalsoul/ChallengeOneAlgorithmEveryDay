package JavaAlgorithms.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Returns true if the given string is a palindrome. Otherwise, returns false.
 *
 * A palindrome is a word or sentence that's spelled the same way both forward
 * and backward, ignoring punctuation, case, and spacing.
 */

public class Palindromes {
    public Palindromes () {}

    private boolean checkPalindrome (String str) {
        if (str.length() < 1) return false;

        String[] arr;
        String reverseStr;

        str = str.replaceAll("\\W+", "").toLowerCase();
        arr = str.split("");

        Collections.reverse(Arrays.asList(arr));

        reverseStr = String.join("", (CharSequence[]) arr);

        return str.equals(reverseStr);
    }

    public void showAlg (Scanner reader) {
        String str;

        System.out.println("\nReturns true if the given string is a palindrome. Otherwise, returns false.");
        System.out.println("A palindrome is a word or sentence that's spelled the same way both forward");
        System.out.println("and backward, ignoring punctuation, case, and spacing.");

        System.out.println("\nEnter a word or a sentence: ");
        reader.nextLine();

        str = reader.nextLine();

        System.out.println("\nResult: " + this.checkPalindrome(str));
    }
}
