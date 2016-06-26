package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * Chunkey Monkey make an array to a multidimensional array.
 */
public class ChunkeyMonkey {
    private int[] arr;
    private int chunkey;

    public ChunkeyMonkey (int[] arr, int chunkey) {
        this.arr = arr;
        this.chunkey = chunkey;
    }

    public ArrayList<int[]> doChunkey () {
        ArrayList<int[]> multi = new ArrayList<>();
        int[] intArr = new int[chunkey];
        int p = 0;

        for (int item : arr) {
            intArr[p] = item;

            if (p + 1 == chunkey) {
                multi.add(intArr);
                intArr = new int[intArr.length];
                p = 0;
            } else
                p++;
        }

        return multi;
    }
}
