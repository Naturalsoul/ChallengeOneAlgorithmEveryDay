package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Returns the remaining elements of an array after chopping off n elements from the head.
 *
 * The head means the beginning of the array, or the zeroth index.
 */

public class SlasherFlick {
    public SlasherFlick () {}

    private ArrayList<Integer> getSlashed (ArrayList<Integer> arr, int howMany) {
        if (arr.size() < 1 || howMany >= arr.size()) {
            return null;
        } else if (howMany == 0) {
            return arr;
        }

        ArrayList<Integer> resultArr = new ArrayList<>();

        for (int i = 0; i < arr.size() - howMany; i++)
            resultArr.add(arr.get(i));

        return resultArr;
    }

    public void showAlg (Scanner reader) {
        ArrayList<Integer> arr = new ArrayList<>();
        int howMany;

        System.out.println("\nReturns the remaining elements of an array after chopping off n elements from the head.");
        System.out.println("The head means the beginning of the array, or the zeroth index.");

        System.out.println("\nEnter some numbers separated with spaces:");
        reader.nextLine();

        for (String token; (token = reader.findInLine("[0-9]+")) != null;) {
            arr.add(Integer.valueOf(token));
        }

        System.out.println("\nEnter the quantity of numbers that you want to remove:");
        reader.nextLine();

        try {
            howMany = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            howMany = 0;
        }

        System.out.println("\nResult:");
        System.out.println(this.getSlashed(arr, howMany));
    }
}
