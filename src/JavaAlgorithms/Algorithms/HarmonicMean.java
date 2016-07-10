package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * The harmonic mean of a sequence of n real numbers x 1, x 2,..., xn is defined as:
 * H = n / ( (1 / x1) + (1/ x2) + (1 / x3) + … + (1 / xn) )
 */

public class HarmonicMean {
    public HarmonicMean () {}

    private Double getHarmonicMean (ArrayList<Integer> arr) {
        int quantityOfNumbers = arr.size();
        Double sum = 0.0;

        for (Integer number : arr) {
            sum += (1 / number);
        }

        sum = quantityOfNumbers / sum;

        return sum;
    }
}
