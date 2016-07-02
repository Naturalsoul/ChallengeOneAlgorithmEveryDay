package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Pig Latin takes the first consonant (or consonant cluster) of an English
 * word, moves it to the end of the word and suffixes an "ay".
 * If a word begins with a vowel it just adds "way" to the end.
 */

public class PigLatin {
    public PigLatin () {}

    private String getPigLatinWord (String word) {
        if (word.length() < 1) return "Insert a word, pls.";

        String firstLetter = word.split("")[0];
        String secondLetter = word.split("")[1];

        if (!firstLetter.matches("[a-zA-Z]")) return "Just words, pls :)";

        if (firstLetter.matches("[aeiouAEIOU]")) {
            word += "way";
        } else if (!firstLetter.matches("[aeiouAEIOU]") && !secondLetter.matches("[aeiouAEIOU]")) {
            word = word.substring(2, word.length() - 1) + firstLetter + secondLetter + "ay";
        } else if (!firstLetter.matches("[aeiouAEIOU]")) {
            word = word.substring(1, word.length() - 1) + firstLetter + "ay";
        }

        return word;
    }

    public void showAlg (Scanner reader) {
        String word;

        System.out.println("\nPig Latin takes the first consonant (or consonant cluster) of an English");
        System.out.println("word, moves it to the end of the word and suffixes an \"ay\".");
        System.out.println("If a word begins with a vowel you just add \"way\" to the end.");

        System.out.print("\nEnter a word: ");
        reader.nextLine();

        word = this.getPigLatinWord(reader.nextLine());

        System.out.println("\nResult: " + word);
    }
}
