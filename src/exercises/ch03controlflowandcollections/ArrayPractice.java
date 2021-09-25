package exercises.ch03controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String args[]) {

      int[] intArray = {1, 1, 2, 3, 5, 8};
      // print out only odd numbers in the array
      for (int i = 0; i < intArray.length; i++) {
          if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i]);
          }
      }

      String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
              "I will not eat them in a house. I will not eat them with a mouse.";
      // print out the items in the phrase that are separated by spaces
        // Note: we cannot print array elements directly in Java; we need to use
        // Arrays.toString() or Arrays.deepToString() to print array elements.
      String[] words = phrase.split(" ");
      System.out.println(Arrays.toString(words));

      // print out the sentences in the phrase
      String[] sentences = phrase.split("\\.");
      for (int j = 0; j < sentences.length; j++) {
          sentences[j] = sentences[j] + ".";
      }
      System.out.println(Arrays.toString(sentences));
    }

}
