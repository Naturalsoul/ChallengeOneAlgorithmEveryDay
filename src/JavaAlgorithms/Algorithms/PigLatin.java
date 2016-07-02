package JavaAlgorithms.Algorithms;

/**
 * Pig Latin takes the first consonant (or consonant cluster) of an English
 * word, moves it to the end of the word and suffixes an "ay".
 * If a word begins with a vowel it just adds "way" to the end.
 */

public class PigLatin {
    public PigLatin () {}

    private String getPigLatinWord (String word) {
        String firstLetter = word.split("")[0];
        String secondLetter = word.split("")[1];

        if (firstLetter.matches("[aeiouAEIOU]")) {
            word += "way";
        } else if (!firstLetter.matches("[aeiouAEIOU]") && !secondLetter.matches("[aeiouAEIOU]")) {
            word = word.substring(2, word.length() - 1) + "ay";
        } else if (!firstLetter.matches("[aeiouAEIOU]")) {
            word = word.substring(1, word.length() - 1) + "ay";
        }

        return word;
    }
}
