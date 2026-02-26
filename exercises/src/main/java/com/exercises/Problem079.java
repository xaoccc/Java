package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that calculates the average grade of a student throughout his/her education. 
// On the first line you will receive the student's name, and on each subsequent line his/her annual grades. 
// The student advances to the next grade if his/her annual grade is greater than or equal to 4.00. 
// If the student fails more than once, he/she is expelled and the program ends, printing the student's name and 
// the grade in which he/she was expelled.
// Upon successful completion of the 12th grade, print:
// "{student's name} graduated. Average grade: {average grade of his/her entire education}"
// In case the student is expelled from school, print:
// "{student's name} has been excluded at {grade in which he/she was expelled} grade"
// The value must be formatted to the second decimal place.
// Solution:
public class Problem079 {

    public static void main(String[] args) {
        int grade = 1;
        double score;
        double totalScore = 0;
        int fails = 0;
        try (Scanner input = new Scanner(System.in)) {
            String name = input.nextLine().trim();

            while (grade < 13) {
                score = Double.parseDouble(input.nextLine());               
                if (score >= 4) {
                    totalScore += score;
                    grade++;
                } else {
                    fails++;
                    if (fails > 1 ) {
                        System.out.printf("%s has been excluded at %d grade", name, grade);
                        return;
                    }
                }

            }
            System.out.printf("%s graduated. Average grade: %.2f", name, (double) totalScore / 12);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
