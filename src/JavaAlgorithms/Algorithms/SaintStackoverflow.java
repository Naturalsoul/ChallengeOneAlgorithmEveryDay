package JavaAlgorithms.Algorithms;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * Do you need something ? Stackoverflow is the answer :D !
 */

public class SaintStackoverflow {
    public SaintStackoverflow () {}

    private void getHelp (String query) {
        if (query.length() < 1) {
            query = "http://www.stackoverflow.com";
        }

        query = query.replaceAll(" ", "+");

        switch (query) {
            case "puppy":
                query = "https://goo.gl/rS4dRK";
                break;

            case "Naturalsoul":
                query = "https://cl.linkedin.com/in/rauleduardoc";
                break;

            default:
                query = "http://www.stackoverflow.com/search?q=" + query;
                break;
        }

        URI link = URI.create(query);

        try {
            Desktop.getDesktop().browse(link);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
