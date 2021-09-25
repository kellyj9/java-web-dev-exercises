package exercises.ch03controlflowandcollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> intArl = new ArrayList<>();
        intArl.add(1);
        intArl.add(2);
        intArl.add(3);
        intArl.add(2);
        intArl.add(3);
        intArl.add(2);
        intArl.add(0);
        intArl.add(4);
        intArl.add(9);
        intArl.add(10);

        System.out.println("\nHere are the Integers in the ArrayList:");
        printIntegerArl(intArl);

        System.out.println("\nThe sum of the even numbers in the ArrayList is:");
        System.out.println(sumEvenNumbers(intArl));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox.";
        System.out.println("\nThe example phrase is:\n" + phrase + "\n");

        System.out.println("\nWe can search the string for words containing a certain number of characters.");
        System.out.println("\nPlease enter a number of characters.");
        Scanner input = new Scanner(System.in);
        int numChars = input.nextInt();

        printWordsWithLength(phrase, numChars);

    }

    // returns the sum of all the even numbers in an ArrayList
    public static int sumEvenNumbers(ArrayList<Integer> arl) {
        int total = 0;
        for (int currentNum : arl) {
            if (currentNum % 2 == 0) {
                total += currentNum;
            }
        }
        return total;
    }
    public static void printIntegerArl(ArrayList<Integer> arl) {
        for (int i = 0; i < arl.size();i++)
        {
            System.out.println(arl.get(i));
        }
    }

    public static void printWordsWithLength(String phraseStr, int numberOfCharacters) {
        String[] splitPhrase = phraseStr.split(" ");
        ArrayList<String> arl = new ArrayList<String>(Arrays.asList(splitPhrase));

        for (String word : arl) {
            if (word.length() == numberOfCharacters) {
                System.out.println(word);
            }
        }
    }

}
