package JavaAlgorithms.Algorithms;

/**
 * This algorithms returns true if the string in the first element of the array contains all of the
 * letters of the string in the second element of the array.
 */

public class Mutations {
    private String first;
    private String[] second;

    public Mutations (String[] param) {
        this.first = param[0].toLowerCase();
        this.second = param[1].toLowerCase().split("");
    }

    public boolean checkMutation () {
        boolean flag = true;

        for (String letter : second)
            flag = first.contains(letter);

        return flag;
    }
}
