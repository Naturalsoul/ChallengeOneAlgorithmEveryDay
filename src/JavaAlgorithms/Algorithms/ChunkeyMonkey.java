package JavaAlgorithms.Algorithms;

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

    public int[][] doChunkey () {
        int[][] multi = new int[chunkey][chunkey];
        int p = 0;

        for (int i = 0; i < chunkey; i++) {
            for (int k = 0; k < chunkey; k++) {
                multi[i][k] = arr[p];
                p++;
            }
        }

        return multi;
    }
}
