/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safariprojects;

import java.util.Scanner;
/**
 *
 * @author kurt.kampa
 */
public class ClassAverage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        
        System.out.printf("#%d. Enter grade (-1 to quit):",gradeCounter + 1);
        int grade = input.nextInt();
        
        while (grade != -1)
        {
            total = total + grade;
            gradeCounter++;
            System.out.printf("#%d. Enter grade (-1 to quit):",gradeCounter + 1);
            grade = input.nextInt();           
                               
        }
        
        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.printf("%nNumber of grades - %d for a total of %d %n", gradeCounter, total);
            System.out.printf("Class average =%.2f%n", average);
        }
        else System.out.printf("No Grades entered");
        
    }
    
}
