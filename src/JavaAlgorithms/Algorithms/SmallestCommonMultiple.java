package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Finds the smallest common multiple of the provided parameters that can be evenly divided
 * by both, as well as by all sequential numbers in the range between these parameters.
 *
 * The range will be an array of two numbers that will not necessarily be in numerical order.
 *
 * e.g. for 1 and 3 - find the smallest common multiple of both 1 and 3 that is evenly divisible by all numbers between 1 and 3.
 */

public class SmallestCommonMultiple {
    private int smallest;
    private int larger;
    private ArrayList<Integer> range;
    private ArrayList<Integer> smallestTable;
    private ArrayList<Integer> largerTable;
    private int scm;

    public SmallestCommonMultiple () {}

    private int getSmallestCommonMultiple (Integer[] numbers) {
        boolean aPossibleSCM = false;

        if (numbers.length < 2) return 0;

        smallest = Math.min(numbers[0], numbers[1]);
        larger = Math.max(numbers[0], numbers[1]);

        for (int i = smallest; i <= larger; i++)
            range.add(i);

        for (int i = 1; i <= 100; i++) {
            smallestTable.add(smallest * i);
            largerTable.add(larger * i);
        }

        for (int i = 0; i < smallestTable.size(); i++) {
            if (smallestTable.indexOf(largerTable.get(i)) != -1) {
                for (Integer aRangeNumber : range) {
                    if (smallestTable.get(i) % aRangeNumber == 0)
                        aPossibleSCM = true;
                    else {
                        aPossibleSCM = false;
                        break;
                    }
                }

                if (aPossibleSCM) {
                    scm = smallestTable.get(i);
                }

            }
        }

        return scm;
    }

    public void showAlg (Scanner reader) {
        Integer[] arr = new Integer[2];

        System.out.println("\nFinds the smallest common multiple of the provided parameters that can be evenly divided");
        System.out.println("by both, as well as by all sequential numbers in the range between these parameters.");

        System.out.print("\nEnter the first number: ");
        reader.nextLine();

        arr[0] = Integer.valueOf(reader.findInLine("[0-9]+"));

        System.out.print("Enter the second number: ");
        reader.nextLine();

        arr[1] = Integer.valueOf(reader.findInLine("[0-9]+"));

        System.out.println("\nResult: " + this.getSmallestCommonMultiple(arr));
    }
}
