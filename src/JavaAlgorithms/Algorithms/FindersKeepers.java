package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * It looks through an array (first argument) and returns the
 * elements in the array that passes a truth test (second argument).
 */

public class FindersKeepers {
    public FindersKeepers () {}

    private ArrayList<Integer> getEvenNumbers (ArrayList<Integer> numbers, Predicate<Integer> checkEvenNumbers) {
        if (numbers.size() < 1) {
            numbers.add(0);
            return numbers;
        }

        return numbers.stream()
                .filter(checkEvenNumbers)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void showAlg (Scanner reader) {
        System.out.println("\nIt looks through an array (first argument) and returns the");
        System.out.println("elements in the array that passes a truth test (second argument).");

        System.out.println("\nEnter some numbers separated with spaces:");
        reader.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String token; (token = reader.findInLine("[0-9]+")) != null;) {
            numbers.add(Integer.valueOf(token));
        }

        System.out.println("\nResult:");
        System.out.println(this.getEvenNumbers(numbers, (n) -> n % 2 == 0));
    }
}
