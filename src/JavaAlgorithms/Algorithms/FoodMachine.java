package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * A food machine has products of three types, A, B and C, which are respectively worth $270, $340 and $390.
 * The machine accepts and gives of returned $10, $50 and $100 coins.
 */

public class FoodMachine {
    public FoodMachine () {}

    private ArrayList<Integer> buyFood (String food, ArrayList<Integer> money) {
        ArrayList<Integer> change = new ArrayList<>();
        int sum = (100 * money.get(0)) + (50 * money.get(1)) + (10 * money.get(2));

        if (sum < 1) {
            change.add(0);
            return change;
        }

        switch (food.toLowerCase()) {
            case "a":
                change = this.getChange(270, sum);
                break;

            case "b":
                change = this.getChange(340, sum);
                break;

            case "c":
                change = this.getChange(390, sum);
                break;

            default:
                change.add(0);
                break;
        }

        return change;
    }

    private ArrayList<Integer> getChange (int price, int paid) {
        int[] coins = new int[] {100, 50, 10};
        int change = price - paid;
        int sum;
        int p = 1;
        ArrayList<Integer> allCoinsToGiveBack = new ArrayList<>();

        for (int coin : coins) {
            while (true) {
                sum = (coin * p);
                if (sum > change) {
                    allCoinsToGiveBack.add(p - 1);
                    break;
                }
                p++;
            }
        }

        return allCoinsToGiveBack;
    }
}
