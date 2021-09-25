package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("How many miles have you driven?");
       Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas were used?");
        Double numGallons = input.nextDouble();

        Double milesPerGallon = numMiles / numGallons;
        System.out.println("The miles per gallon is " + milesPerGallon + " mpg.");
    }

}
