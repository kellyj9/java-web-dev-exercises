package exercises;
import java.util.Scanner;

public class SearchString {
    public static void main (String[] args) {
        String stringToSearch =  "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("The following is a sentence from a book:\n\n" + stringToSearch);
        System.out.println("\nPlease enter the term to search for within the sentence.");
        String searchTerm = input.next();

//        if (stringToSearch.toLowerCase().indexOf(searchTerm.toLowerCase()) >= 0)
//            System.out.println("\nTrue; The search term was found in the sentence.");
//        else
//            System.out.println("\nFalse; The search term was not found in the sentence");

        Integer indexOfSearchTerm = stringToSearch.toLowerCase().indexOf(searchTerm.toLowerCase());
        if (indexOfSearchTerm >= 0) {
            System.out.println("\nTrue; The search term was found in the sentence at index " + indexOfSearchTerm + ".");
            System.out.println("\nTrue; The search term has " + searchTerm.length() + " characters.");
            String modifiedString = stringToSearch.replace(searchTerm, "");
            System.out.println("\nAfter removing all occurrences of the search term from the sentence, " +
                    "the modified sentence is:\n\n" + modifiedString);
        }
        else {
            System.out.println("\nFalse; The search term was not found in the sentence");
        }
    }

}
