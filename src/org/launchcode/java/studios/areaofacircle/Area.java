package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        Double radius = getValidInput(); // get and validate the radius input from the user
        Double area = Circle.getArea(radius);
        System.out.println("\nThe area of a circle with radius " + radius + " is " + area);
    }

    public static Double getValidInput() {
        Scanner input = new Scanner(System.in);
        String inputRadius;  // user input of radius as a String type
        Double radius = 0.0;  // will hold the inputRadius converted to a Double type
        boolean isValidInput = false;  // true when data input is valid; used to end the do...while loop

        // request and validate radius input from user.  loop until valid data entered.
        do {
            System.out.println("Please enter the radius:");
            inputRadius = input.nextLine();
            try {
                radius = Double.parseDouble(inputRadius);  // return the Double value represented by the String
                if (radius <= 0.0) {
                    System.out.println("\nInvalid input.  Input must be a positive number.");
                } else {
                    isValidInput = true;
                }
            }
            catch (Exception e) {
                System.out.println("\nInvalid input. Input must be a floating point number.");
            }
        } while (!isValidInput);
        return radius;
    }

}
