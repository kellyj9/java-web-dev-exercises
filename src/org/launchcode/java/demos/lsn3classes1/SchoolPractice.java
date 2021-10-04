package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {
        org.launchcode.java.demos.lsn3classes1.Student kelly = new org.launchcode.java.demos.lsn3classes1.Student("Kelly", 1, 1, 4.0);
        System.out.println(kelly.getName() + " is a student!");
        System.out.println(kelly);
        System.out.println("After adding 12 course credits with a grade of 3.5:");
        kelly.addGrade(12, 3.5);
        System.out.println(kelly);
        System.out.println("After adding 25 course credits with a grade of 3.8:");
        kelly.addGrade(25, 3.8);
        System.out.println(kelly);
        System.out.println("After adding 60 course credits with a grade of 3.9:");
        kelly.addGrade(60, 3.9);
        System.out.println(kelly);
    }
}
