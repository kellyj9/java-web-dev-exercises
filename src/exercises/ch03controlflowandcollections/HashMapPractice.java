package exercises.ch03controlflowandcollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and student IDs
        do {

            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newStudentID = input.nextInt();
                students.put(newStudent, newStudentID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (ID: " + student.getValue() + ")");
        }
    }

}
