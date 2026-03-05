package com.exercises;

import java.util.Scanner;
// Description:
// The "Train the trainers" course is coming to an end and the final assessment is approaching. 
// Your task is to help the jury that will assess the presentations by writing a program that calculates the average grade for each presentation 
// by a given student, and finally the average grade for all of them.
// The first line of the console reads the number of people in the jury n - an integer in the interval [1…20]
// Then the name of the presentation - text is read on a separate line
// For each presentation, n - the number of grades - a real number in the interval [2.00…6.00] are read on a new line
// After calculating the average grade for a specific presentation, the console prints
// "{presentation name} - {average grade}."
// After receiving the "Finish" command, the console prints "Student's final assessment is {average grade from all presentations}." and the program ends.
// All grades must be formatted to the second decimal place. console, no result is output.
// Solution:

public class Problem097 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int juryNum = Integer.parseInt(input.nextLine());
            String command = input.nextLine().trim();
            double total = 0;
            int presentationsNum = 0;
            while (!command.equals("Finish")) {
                double totalGrade = 0;
                int gradesNum = 0;               

                for (int i=0; i<juryNum; i++) {
                    @SuppressWarnings("UnnecessaryTemporaryOnConversionFromString")
                    Double grade = Double.parseDouble(input.nextLine());
                    totalGrade += grade;
                    gradesNum++;
                }
                total += (totalGrade / gradesNum);
                presentationsNum += 1;
                System.out.printf("%s - %.2f.\n", command, totalGrade / gradesNum);
                command = input.nextLine().trim();
            }
            System.out.printf("Student's final assessment is %.2f.", total / presentationsNum);
        }
    }
}
