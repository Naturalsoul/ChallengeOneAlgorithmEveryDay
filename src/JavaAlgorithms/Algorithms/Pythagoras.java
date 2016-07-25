package JavaAlgorithms.Algorithms;

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
}
