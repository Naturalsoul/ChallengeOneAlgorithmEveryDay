package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Returns the remaining elements of an array after chopping off n elements from the head.
 *
 * The head means the beginning of the array, or the zeroth index.
 */

public class SlasherFlick {
    public SlasherFlick () {}

    private ArrayList<Integer> getSlashered (ArrayList<Integer> arr, int howMany) {
        if (arr.size() < 1 || howMany >= arr.size()) {
            return null;
        } else if (howMany == 0) {
            return arr;
        }

        Iterator<Integer> itr = arr.iterator();

        for (int i = 0; i < howMany; i++) {
            itr.remove();
        }

        return arr;
    }
}
