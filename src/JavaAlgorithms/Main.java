package JavaAlgorithms;

import JavaAlgorithms.Algorithms.ChunkeyMonkey;
import JavaAlgorithms.Algorithms.Mutations;
import JavaAlgorithms.Algorithms.SeekAndDestroy;

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
        Scanner reader = new Scanner (System.in);
        int option;

        while (true) {
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

                case 9:
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
        System.out.println("9) Thanks for the algorithms. Good Bye!!");
        System.out.println("--------------------");
        System.out.print("Choose an option: ");
    }
}
