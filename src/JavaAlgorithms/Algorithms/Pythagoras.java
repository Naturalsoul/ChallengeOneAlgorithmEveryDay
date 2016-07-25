package JavaAlgorithms.Algorithms;

import java.util.Scanner;

/**
 * This algorithm receives as input the lengths of the two sides a and b of a right triangle, and which give
 * as output the length of the hypotenuse c of the triangle, given by the Pythagorean theorem:
 * c² = a² + b²
 */

public class Pythagoras {
    public Pythagoras () {}

    private Double getPythagoras (double a, double b) {
        return Math.pow(a, 2) + Math.pow(b, 2);
    }

    public void showAlg (Scanner reader) {
        double a, b;

        System.out.println("\nThis algorithm receives as input the lengths of the two sides a and b of a right triangle, and which give");
        System.out.println("as output the length of the hypotenuse c of the triangle, given by the Pythagorean theorem:");
        System.out.println("c² = a² + b²");

        System.out.print("\nEnter a: ");
        reader.nextLine();

        try {
            a = Double.valueOf(reader.findInLine("([0-9]+)(\\.)?([0-9]+)?"));
        } catch (Exception ex) {
            a = 0.0;
        }

        System.out.print("Enter b: ");
        reader.nextLine();

        try {
            b = Double.valueOf(reader.findInLine("([0-9]+)(\\.)?([0-9]+)?"));
        } catch (Exception ex) {
            b = 0.0;
        }

        System.out.println("\nResult: " + this.getPythagoras(a, b));
    }
}
