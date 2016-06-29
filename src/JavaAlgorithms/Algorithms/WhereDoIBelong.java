package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Returns the lowest index at which a value (second argument)
 * should be inserted into an array.
 * The returned value is a number.
 */

public class WhereDoIBelong {
    private ArrayList<Double> arr;
    private double number;

    public WhereDoIBelong (ArrayList<Double> arr, double number) {
        this.arr = arr;
        this.number = number;
    }

    public int getIndexToIns () {
        // First, we add the element to the array.
        arr.add(number);

        // Then, we need to sort the array.
        Collections.sort(arr);

        // And finally, we just return the index of the number.
        return arr.indexOf(number);
    }
}
