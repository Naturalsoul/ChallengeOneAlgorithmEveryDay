package JavaAlgorithms.Algorithms;

/**
 * A couple of numbers m and n are called friendly (or known as a friendly couple), if the sum of all divisors of m (excluding m) is equal to the
 * number n, and the sum of all divisors of the number n (excluding n) is equal to m (with m ≠ n).
 *
 * For example, the numbers 220 and 284 are a friendly couple because the unique numbers
 * that divide accurately 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, and:
 *  1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
 *
 * Therefore, 220 is a friendly number. The only numbers that divide exactly 284 are 1, 2, 4, 71, and 142 and:
 *  1 + 2 + 4 + 71 + 142 = 220
 *
 *  Therefore, 284 is a friendly number.
 */

public class FriendlyNumbers {
    public FriendlyNumbers () {}

    private boolean areFriendlyNumbers (int[] arr) {
        int sum = 0;

        for (int i = 1; i < arr[0]; i++) {
            if (arr[0] % i == 0) {
                sum += i;
            }
        }

        if (sum == arr[1]) {
            sum = 0;
        } else {
            return false;
        }

        for (int i = 1; i < arr[1]; i++) {
            if (arr[1] % i == 0) {
                sum += i;
            }
        }

        return sum == arr[0];
    }
}
