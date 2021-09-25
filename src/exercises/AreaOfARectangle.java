package exercises;
import java.util.Scanner;

public class AreaOfARectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        Double length = input.nextDouble();

        System.out.println("Enter the width of the rectagle: ");
        Double width = input.nextDouble();

        // print the area of the rectangle
        Double areaOfRectangle = length * width;
        System.out.println("The are of the rectagle is " + areaOfRectangle);
    }

}
