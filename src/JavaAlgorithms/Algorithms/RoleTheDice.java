package JavaAlgorithms.Algorithms;

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
}
