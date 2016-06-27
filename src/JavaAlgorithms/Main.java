package JavaAlgorithms;

import JavaAlgorithms.Algorithms.ChunkeyMonkey;

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
                    System.out.println("The Chunkey Monkey algorithm take an array and a chunk parameter");
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
        System.out.println("9) Thanks for the algorithms. Good Bye!!");
        System.out.println("--------------------");
        System.out.print("Choose an option: ");
    }
}
