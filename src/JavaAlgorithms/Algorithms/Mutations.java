package JavaAlgorithms.Algorithms;

/**
 * This algorithms returns true if the string in the first element of the array contains all of the
 * letters of the string in the second element of the array.
 */

public class Mutations {
    private String first;
    private String second;

    public Mutations (String first, String second) {
        this.first = first;
        this.second = second;
    }

    public boolean checkMutation () {
        boolean flag = true;
        String[] secondArr = second.toLowerCase().split("");

        for (String letter : secondArr)
            flag = first.contains(letter);

        return flag;
    }
}
