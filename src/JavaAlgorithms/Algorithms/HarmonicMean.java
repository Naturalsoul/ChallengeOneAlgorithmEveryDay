package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The harmonic mean of a sequence of n real numbers x1, x2,..., xn is defined as:
 * H = n / ( (1 / x1) + (1/ x2) + (1 / x3) + … + (1 / xn) )
 */

public class HarmonicMean {
    public HarmonicMean () {}

    private Double getHarmonicMean (ArrayList<Integer> arr) {
        if (arr.get(0) < 1) return 0.0;

        int quantityOfNumbers = arr.get(0);
        Double sum = 0.0;

        arr.remove(0);

        for (double number : arr) {
            sum += (1 / number);
        }

        sum = quantityOfNumbers / sum;

        return sum;
    }

    public void showAlg (Scanner reader) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("\nThe harmonic mean of a sequence of n real numbers x1, x2,..., xn is defined as:");
        System.out.println("H = n / ( (1 / x1) + (1/ x2) + (1 / x3) + … + (1 / xn) )");
        System.out.print("\nEnter the quantity of numbers: ");
        reader.nextLine();

        try {
            arr.add(Integer.valueOf(reader.findInLine("[1-9]+")));
        } catch (Exception ex) {
            arr.add(0);
        }

        for (int i = 0; i < arr.get(0); i++) {
            System.out.print((i + 1) + "º number: ");
            reader.nextLine();

            try {
                arr.add(Integer.valueOf(reader.findInLine("[1-9]+")));
            } catch (Exception ex) {
                arr.add(1);
            }
        }

        System.out.println("Result: " + this.getHarmonicMean(arr));
    }
}
