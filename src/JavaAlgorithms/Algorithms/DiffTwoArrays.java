package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Compares two lists and returns a new list with any items only found in one of the two given arrays, but not both.
 * In other words, returns the symmetric difference of the two arrays.
 */
public class DiffTwoArrays {
    private List<String> arr1; // This List must be always greater than arr2.
    private List<String> arr2;

    public DiffTwoArrays (ArrayList<String> arr1, ArrayList<String> arr2) {
        if (arr1.size() >= arr2.size()) {
            this.arr1 = new ArrayList<>(arr1);
            this.arr2 = new ArrayList<>(arr2);
        } else {
            this.arr1 = new ArrayList<>(arr2);
            this.arr2 = new ArrayList<>(arr1);
        }
    }

    public List<String> getSymmetricDifference () {
        /*
         * 'Cause arr1 always must have more elements than arr2, it only need to
         * remove all the elements of the arr2 that are in the arr1 list to have
         * just the elements present in one array.
         */

        arr1.removeAll(arr2);

        return arr1;
    }
}
