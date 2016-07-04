package JavaAlgorithms.Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Converts the given number into a roman numeral.
 * I don't feel good today, also. My motivations is not high now 'cause I'm living a bad moment.
 * I hope I'll feel better soon.
 */

public class RomanNumeralConverter {
    private Map<Integer, String> rNumbers = new HashMap<>();

    public RomanNumeralConverter () {
        rNumbers.put(1, "I");
        rNumbers.put(2, "II");
        rNumbers.put(3, "III");
        rNumbers.put(4, "IV");
        rNumbers.put(5, "V");
        rNumbers.put(6, "VI");
        rNumbers.put(7, "VII");
        rNumbers.put(8, "VIII");
        rNumbers.put(9, "IX");
        rNumbers.put(10, "X");
        rNumbers.put(20, "XX");
        rNumbers.put(30, "XXX");
        rNumbers.put(40, "XL");
        rNumbers.put(50, "L");
        rNumbers.put(60, "LX");
        rNumbers.put(70, "LXX");
        rNumbers.put(80, "LXXX");
        rNumbers.put(90, "LC");
    }

    private String convertToRomanNumber (int number) {
        String[] arr = String.valueOf(number).split("");
        String finalNumber;

        finalNumber = String.valueOf(this.rNumbers.get(Integer.valueOf(arr[0]) * 10));
        finalNumber += String.valueOf(this.rNumbers.get(Integer.valueOf(arr[1]) * 10));

        return finalNumber;
    }


}
