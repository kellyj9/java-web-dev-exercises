package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // This method accepts two parameters—a number of course credits and
    // a numerical grade (0.0-4.0). With this data, the student’s GPA is updated.
    public void addGrade (int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    // returns the student’s level based on the number of credits they have earne
    public String getGradeLevel(int credits) {
        if (credits <= 29){
            return "freshman";
        } else if (credits <= 59){
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }

    @Override
    public String toString() {
        return String.format("%s is a %s with %d credits and a GPA of %.2f.",
                this.name,
                this.getGradeLevel(this.numberOfCredits),
                this.getNumberOfCredits(),
                this.getGpa());// also testing get functions

    }
}