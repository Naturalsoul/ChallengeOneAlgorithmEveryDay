package JavaAlgorithms;

import JavaAlgorithms.Algorithms.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hey!! This is a list of algorithms. Originally, these algorithms are from FreeCodeCamp.com where you
 * need to code them in Javascript. I will convert them to Java.
 */

public class Main {
    public static void main(String[] args) {
        int option;

        while (true) {
            Scanner reader = new Scanner (System.in);
            menu();

            try {
                option = reader.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nJust numbers, pls\n");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("The Chunkey Monkey algorithm takes an array and a chunk parameter");
                    System.out.println("to split the array into a multidimensional one.");
                    System.out.println("\nThis is the array that is using:");
                    System.out.println("[1, 2, 3, 4, 6]");
                    System.out.println("The chunk parameter is: 2\n");
                    System.out.println("And this is the result:");

                    int[] arr = new int[] {1, 2, 3, 4, 5, 6};
                    ChunkeyMonkey chunkey = new ChunkeyMonkey(arr, 2);

                    ArrayList<int[]> chunkeyArr = chunkey.doChunkey();

                    for (int[] item : chunkeyArr)
                        System.out.print(Arrays.toString(item) + " ");
                    System.out.print("\n");

                    break;

                case 2:
                    System.out.println("The Mutations algorithm takes two Strings. The second parameter is");
                    System.out.println("the letters that I want to know if the first string contains.");
                    System.out.print("\nEnter the first String: ");

                    String[] parameters = new String[2];

                    reader.nextLine();
                    parameters[0] = reader.nextLine();

                    System.out.print("And the second, pls: ");
                    parameters[1] = reader.nextLine();

                    Mutations mut = new Mutations(parameters);

                    System.out.println("The result is: " + mut.checkMutation());
                    break;

                case 3:
                    System.out.println("\nThe algorithm takes two arguments: The first is the numbers that You have");
                    System.out.println("and the second is those You want to seek to destroy them in the first arguments.");
                    System.out.println("\nEnter the firsts numbers:");

                    ArrayList<Integer> arr1 = new ArrayList<>();
                    reader.nextLine();

                    for (String token; (token = reader.findInLine("[0-9]+")) != null;)
                        arr1.add(Integer.valueOf(token));

                    System.out.println("Now, enter the numbers that you want to destroy:");

                    ArrayList<Integer> arr2 = new ArrayList<>();
                    reader.nextLine();

                    for (String token; (token = reader.findInLine("[0-9]+")) != null;)
                        arr2.add(Integer.valueOf(token));

                    SeekAndDestroy sd = new SeekAndDestroy(arr1, arr2);

                    System.out.println("\nResult:");
                    System.out.println(sd.doDestroy().toString() + "\n");
                    break;

                case 4:
                    System.out.println("Returns the lowest index at which a value (second argument) should be inserted into an array");
                    System.out.println("(first argument). The returned value is a number.");

                    System.out.println("\nEnter some numbers separated with spaces:");
                    reader.nextLine();

                    ArrayList<Double> listOfNumbers = new ArrayList<>();

                    for (String token; (token = reader.findInLine("[0-9]+(\\.\\d+)?")) != null;)
                        listOfNumbers.add(Double.valueOf(token));

                    System.out.println("Enter the number that you want to insert:");
                    reader.nextLine();

                    double number = 0;

                    for (String token; (token = reader.findInLine("[0-9]+(\\.\\d+)?")) != null;)
                        number = Double.parseDouble(token);

                    WhereDoIBelong wdib = new WhereDoIBelong(listOfNumbers, number);

                    System.out.println("\nResult: " + wdib.getIndexToIns());
                    break;

                case 5:
                    DiffTwoArrays dta = new DiffTwoArrays();
                    dta.showAlg(reader);
                    break;

                case 6:
                    SearchAndReplace sr = new SearchAndReplace();
                    sr.showAlg(reader);
                    break;

                case 7:
                    PigLatin pl = new PigLatin();
                    pl.showAlg(reader);
                    break;

                case 8:
                    SpinalCase sc = new SpinalCase();
                    sc.showAlg(reader);
                    break;

                case 9:
                    RomanNumeralConverter rnc = new RomanNumeralConverter();
                    rnc.showAlg();
                    break;

                case 10:
                    FibonacciOddSum fos = new FibonacciOddSum();
                    fos.showAlg(reader);
                    break;

                case 11:
                    SumAllPrimes sap = new SumAllPrimes();
                    sap.showAlg(reader);
                    break;

                case 12:
                    SmallestCommonMultiple scm = new SmallestCommonMultiple();
                    scm.showAlg(reader);
                    break;

                case 13:
                    FriendlyNumbers fn = new FriendlyNumbers();
                    fn.showAlg(reader);
                    break;

                case 14:
                    NetPresentValue npv = new NetPresentValue();
                    npv.showAlg(reader);
                    break;

                case 15:
                    HarmonicMean hm = new HarmonicMean();
                    hm.showAlg(reader);
                    break;

                case 16:
                    FoodMachine fm = new FoodMachine();
                    fm.showAlg(reader);
                    break;

                case 17:
                    SquareRoot sq = new SquareRoot();
                    sq.showAlg(reader);
                    break;

                case 18:
                    TruncateAString ts = new TruncateAString();
                    ts.showAlg(reader);
                    break;

                case 19:
                    ConfirmTheEnding ce = new ConfirmTheEnding();
                    ce.showAlg(reader);
                    break;

                case 20:
                    FactorializeANumber fan = new FactorializeANumber();
                    fan.showAlg(reader);
                    break;

                case 21:
                    FindersKeepers fk = new FindersKeepers();
                    fk.showAlg(reader);
                    break;

                case 22:
                    RepeatAStringRepeatAString rsrs = new RepeatAStringRepeatAString();
                    rsrs.showAlg(reader);
                    break;

                case 23:
                    SumAllNumbersInARange saniar = new SumAllNumbersInARange();
                    saniar.showAlg(reader);
                    break;

                case 24:
                    BinaryAgents ba = new BinaryAgents();
                    ba.showAlg(reader);
                    break;

                case 29:
                    System.out.println("\nSee ya!!");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void menu () {
        System.out.println("--------------------");
        System.out.println("Hi!! :D. Choose an algorithm!");
        System.out.println("1) Chunkey Monkey.");
        System.out.println("2) Mutations.");
        System.out.println("3) Seek and Destroy.");
        System.out.println("4) Where Do I Belong.");
        System.out.println("5) Diff Two Arrays.");
        System.out.println("6) Search And Replace.");
        System.out.println("7) Pig Latin.");
        System.out.println("8) Spinal Case.");
        System.out.println("9) Roman Numeral Converter.");
        System.out.println("10) Fibonacci's Odd Sum.");
        System.out.println("11) Sum All Primes.");
        System.out.println("12) Smallest Common Multiple.");
        System.out.println("13) Friendly Numbers.");
        System.out.println("14) Net Present Values.");
        System.out.println("15) Harmonic Mean.");
        System.out.println("16) Food Machine.");
        System.out.println("17) Square Root.");
        System.out.println("18) Truncate a String.");
        System.out.println("19) Confirm The Ending.");
        System.out.println("20) Factorialize a Number.");
        System.out.println("21) Finders Keepers.");
        System.out.println("22) Repeat a String Repeat a String.");
        System.out.println("23) Sum All Numbers In A Range.");
        System.out.println("24) Binary Agents.");
        System.out.println("29) Thanks for the algorithms. Good Bye!!");
        System.out.println("--------------------");
        System.out.print("Choose an option: ");
    }
}
