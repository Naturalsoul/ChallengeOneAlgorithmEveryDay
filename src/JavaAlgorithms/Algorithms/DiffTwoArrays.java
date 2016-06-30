package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Compares two lists and returns a new list with any items only found in one of the two given arrays, but not both.
 * In other words, returns the symmetric difference of the two arrays.
 */
public class DiffTwoArrays {
    private List<Integer> arr1; // This List must be always greater than arr2.
    private List<Integer> arr2;

    public DiffTwoArrays () {}

    private List<Integer> getSymmetricDifference (ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        if (arr1.size() >= arr2.size()) {
            this.arr1 = new ArrayList<>(arr1);
            this.arr2 = new ArrayList<>(arr2);
        } else {
            this.arr1 = new ArrayList<>(arr2);
            this.arr2 = new ArrayList<>(arr1);
        }

        /*
         * Just remove all the elements that are equals in both arrays.
         * The arr1Copy is necessary 'cause it eliminates the arr2 elements
         * from the arr1 first.
         */

        List<Integer> arr1Copy = new ArrayList<>(this.arr1);

        this.arr1.removeAll(this.arr2);
        this.arr2.removeAll(arr1Copy);

        this.arr1.addAll(this.arr2);
        Collections.sort(this.arr1);

        return this.arr1;
    }

    public void showAlg (Scanner reader) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("\nCompares two lists and returns a new list with any items only found in one of the two given arrays, but not both.");
        System.out.println("In other words, returns the symmetric difference of the two arrays.");

        System.out.println("\nEnter the numbers of the first array separated with spaces:");
        reader.nextLine();

        for (String token; (token = reader.findInLine("[0-9]+")) != null;)
            arr1.add(Integer.valueOf(token));

        System.out.println("Enter the numbers of the second array separated with spaces:");
        reader.nextLine();

        for (String token; (token = reader.findInLine("[0-9]+")) != null;)
            arr2.add(Integer.valueOf(token));

        System.out.println("\nResult: " + this.getSymmetricDifference(arr1, arr2).toString());
    }
}
