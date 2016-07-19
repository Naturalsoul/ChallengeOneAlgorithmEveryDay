package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * Returns a binary translated sentence of the passed English string.
 */

public class BinaryAgents {
    public BinaryAgents () {}

    private String translateToBinary (String str) {
        if (str.length() < 1) return "";

        str = str.replaceAll(" ", "");
        char[] arr = str.toCharArray();
        String binaryTranslation = "";
        int charCode;

        for (char letter : arr) {
            charCode = (int) letter;
            binaryTranslation += Integer.toBinaryString(charCode) + " ";
        }

        binaryTranslation = binaryTranslation.trim();

        return binaryTranslation;
    }

    public void showAlg (Scanner reader) {
        String sentence;

        System.out.println("\nReturns a binary translated sentence of the passed English string.");
        System.out.println("\nEnter a sentence:");
        reader.nextLine();

        sentence = reader.nextLine();

        System.out.println("\nResult:");
        System.out.println(this.translateToBinary(sentence));
    }
}
