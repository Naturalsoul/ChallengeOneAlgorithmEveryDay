package JavaAlgorithms.Algorithms;

import java.util.HashMap;
import java.util.Map;

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
        String[] toCheck = {"&", "<", ">", "\"", "\'"};

        for (String entry : toCheck)
            str = str.replaceAll(entry, this.htmlEntries.get(entry));

        return str;
    }
}
