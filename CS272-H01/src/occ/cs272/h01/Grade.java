/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author <mhuynh76>
 * @version <September 8, 2019>
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mhuynh76";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
        //TODO Complete this method
        double numericGrade = 0;
        
        switch(grade)
        {
        case "A" : case "a+" : case"a" : case "A+" :numericGrade = 4.0;
        break;
        case "a-" : case "A-" :numericGrade = 3.7;
        break;
        case "b+" : case "B+" :numericGrade = 3.3;
        break;
        case "b" : case "B" : numericGrade = 3.0;
        break;
        case "b-" : case "B-" :numericGrade = 2.7;
        break;
        case "c+" : case"C+" : numericGrade = 2.3;
        break;
        case "c" : case"C" : numericGrade = 2.0;
        break;
        case "c-" : case "C-" : numericGrade = 1.7; 
        break;
        case "d+" : case "D+" : numericGrade = 1.3;
        break; 
        case "d" : case "D" :numericGrade = 1.0;
        break;
        case "d-" : case "D-" :numericGrade = 0.7;
        break; 
        case "f" : case "F" : numericGrade = 0.0;
       
        default: numericGrade = -1.0;
        break;
        }
        
        return numericGrade; 
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
