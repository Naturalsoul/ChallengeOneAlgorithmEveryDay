package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * It will be provided with an initial array (the first argument in the destroyer function), followed by one or more arguments.
 * This removes all elements from the initial array that are of the same value as these arguments.
 */

public class SeekAndDestroy {
    private ArrayList<Integer> arr, toSeek;

    public SeekAndDestroy (ArrayList<Integer> arr, ArrayList<Integer> toSeek) {
        this.arr = arr;
        this.toSeek = toSeek;
    }

    public ArrayList<Integer> doDestroy () {
        toSeek.stream().filter(number -> arr.indexOf(number) != -1)
                .forEach(number -> arr.remove(arr.indexOf(number)));

        return arr;
    }
}
