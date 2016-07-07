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
 *
 * I think this algorithm could be optimized. I hope you can help me :)
 */

public class SmallestCommonMultiple {


    public SmallestCommonMultiple () {}

    private int getSmallestCommonMultiple (Integer[] numbers) {
        int smallest;
        int larger;
        ArrayList<Integer> range = new ArrayList<>();
        ArrayList<Integer> smallestTable = new ArrayList<>();
        ArrayList<Integer> largerTable = new ArrayList<>();
        int scm = 0;
        boolean aPossibleSCM = false;

        if (numbers.length < 2 || numbers[0] < 1 && numbers[1] < 1) return 0;

        smallest = Math.min(numbers[0], numbers[1]);
        larger = Math.max(numbers[0], numbers[1]);

        for (int i = smallest; i <= larger; i++)
            range.add(i);

        for (int i = 1; i <= 100; i++) {
            smallestTable.add(smallest * i);
            largerTable.add(larger * i);
        }

        for (Integer aSmallestTableNumber : smallestTable) {
            if (largerTable.indexOf(aSmallestTableNumber) != -1) {
                for (Integer aRangeNumber : range) {
                    if (aSmallestTableNumber % aRangeNumber == 0)
                        aPossibleSCM = true;
                    else {
                        aPossibleSCM = false;
                        break;
                    }
                }

                if (aPossibleSCM) {
                    scm = aSmallestTableNumber;
                    break;
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

        try {
            arr[0] = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            arr[0] = 0;
        }

        System.out.print("Enter the second number: ");
        reader.nextLine();

        try {
            arr[1] = Integer.valueOf(reader.findInLine("[0-9]+"));
        } catch (Exception ex) {
            arr[1] = 0;
        }

        System.out.println("\nResult: " + this.getSmallestCommonMultiple(arr));
    }
}
