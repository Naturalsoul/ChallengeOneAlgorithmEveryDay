package JavaAlgorithms.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dice notation (also known as dice algebra, common dice notation, RPG dice notation, and several other titles)
 * is a system to represent different combinations of dice in role-playing games using simple algebra-like notation such as 2d6+12.
 *
 * Here, you can roll a D4, D6, D8, D10, D12, D20, D30, D100.
 */

public class RoleTheDice {
    public RoleTheDice () {}

    private int rollIt (int dice) {
        if (dice == 0) return 1;

        int times = 1;

        switch (dice) {
            case 1:
                times = 4;
                break;

            case 2:
                times = 6;
                break;

            case 3:
                times = 8;
                break;

            case 4:
                times = 10;
                break;

            case 5:
                times = 12;
                break;

            case 6:
                times = 20;
                break;

            case 7:
                times = 30;
                break;

            case 8:
                times = 100;
                break;
        }

        return (int) (Math.random() * times) + 1;
    }

    public void showAlg (Scanner reader) {
        int dice, times, sum = 0;
        ArrayList<String> nums = new ArrayList<>();
        String allTheNumbers;

        System.out.println("\nDice notation (also known as dice algebra, common dice notation, RPG dice notation, and several other titles)");
        System.out.println("is a system to represent different combinations of dice in role-playing games using simple algebra-like notation such as 2d6+12.");
        System.out.println("Here, you can roll a D4, D6, D8, D10, D12, D20, D30, D100.");

        System.out.println("\nDices ----------");
        System.out.println("1) D4.");
        System.out.println("2) D6.");
        System.out.println("3) D8.");
        System.out.println("4) D10.");
        System.out.println("5) D12.");
        System.out.println("6) D20.");
        System.out.println("7) D30.");
        System.out.println("8) D100.");
        System.out.println("------------------");

        System.out.print("Select a dice: ");
        reader.nextLine();

        try {
            dice = Integer.valueOf(reader.findInLine("[1-8]"));
        } catch (Exception ex) {
            dice = 0;
        }

        System.out.print("How many times?: ");
        reader.nextLine();

        try {
            times = Integer.valueOf(reader.findInLine("[1-9]"));
        } catch (Exception ex) {
            times = 1;
        }

        System.out.println("\nResult:");

        for (int i = 0; i < times; i++) {
            int n = this.rollIt(dice);
            sum += n;

            nums.add(String.valueOf(n));
        }

        allTheNumbers = String.join(" + ", nums);

        System.out.println(allTheNumbers + " = " + sum);
    }
}
