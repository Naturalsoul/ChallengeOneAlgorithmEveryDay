package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * It looks through an array (first argument) and returns the first
 * element in the array that passes a truth test (second argument).
 */

public class FindersKeepers {
    public FindersKeepers () {}

    private ArrayList<Integer> getEvenNumbers (ArrayList<Integer> numbers, Runnable checkEvenNumbers) {
        if (numbers.size() < 1) {
            numbers.add(0);
            return numbers;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer n : numbers) {
            if (checkEvenNumbers(n)) {
                arr.add(n);
            }
        }

        return arr;
    }
}
