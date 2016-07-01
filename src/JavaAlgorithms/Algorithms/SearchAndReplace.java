package JavaAlgorithms.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Performs a search and replace on the sentence using the arguments provided and returns the new sentence.
 * First argument is the sentence to perform the search and replace on.
 * Second argument is the word that it will be replacing (before).
 * Third argument is what it will be replacing the second argument with (after).
 * It preserves the case of the original word when it is replacing it.
 * For example if you mean to replace the word "Book" with the word "dog", it should be replaced as "Dog".
 */

public class SearchAndReplace {
    public SearchAndReplace () {}

    private String getNewSentence (String sentence, String oldWord, String newWord) {
        if (!sentence.contains(oldWord) || sentence.length() < 1)
            return sentence + " (No word has changed).";

        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldWord)) {
                if (Character.isUpperCase(arr[i].charAt(0)))
                    newWord = newWord.substring(0, 1).toUpperCase() + newWord.substring(1).toLowerCase();

                arr[i] = newWord;
            }
        }

        sentence = String.join(" ", arr);

        return sentence;
    }

    public void showAlg (Scanner reader) {
        String[] arr = new String[3];

        System.out.println("\nIt replace a word in a sentence and maintain the first letter capitalized if");
        System.out.println("that the case.");

        reader.nextLine();

        System.out.println("\nEnter the sentence that has a word that you want to replace:");
        arr[0] = reader.nextLine();

        System.out.println("Enter the word that you want to replace:");
        arr[1] = reader.nextLine();

        System.out.println("Enter the new word:");
        arr[2] = reader.nextLine();

        System.out.println("\nResult:");
        System.out.println(this.getNewSentence(arr[0], arr[1], arr[2]) + "\n");
    }
}