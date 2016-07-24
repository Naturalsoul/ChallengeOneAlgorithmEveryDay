package JavaAlgorithms.Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Converts the characters &, <, >, " (double quote), and ' (apostrophe),
 * in a string to their corresponding HTML entities.
 */

public class HTMLEntriesConverter {
    private Map<String, String> htmlEntries;

    public HTMLEntriesConverter () {
        htmlEntries = new HashMap<>();
        htmlEntries.put("&", "&amp;");
        htmlEntries.put("<", "&lt;");
        htmlEntries.put(">", "&gt;");
        htmlEntries.put("\"", "&quot;");
        htmlEntries.put("\'", "&apos;");
    }

    private String getTranslation (String str) {
        if (str.length() < 1) return "";

        String[] toCheck = {"&", "<", ">", "\"", "\'"};

        for (String entry : toCheck)
            str = str.replaceAll(entry, this.htmlEntries.get(entry));

        return str;
    }

    public void showAlg (Scanner reader) {
        String str;

        System.out.println("\nConverts the characters &, <, >, \" (double quote), and ' (apostrophe),");
        System.out.println("in a string to their corresponding HTML entities.");

        System.out.println("\nEnter a sentence that you want to convert:");
        reader.nextLine();

        str = reader.nextLine();

        System.out.println("\nResult:");
        System.out.println(this.getTranslation(str));
    }
}
