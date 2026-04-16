package com.exercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
// Write a program that keeps the information about students and their grades.
// On the first line, you will receive an integer number representing the next pair of rows. On the next lines, you will be receiving each student's name and their grade. Keep track of all grades for each student and keep only the students with an average grade higher than or equal to 4.50.
// Print the final dictionary with students and their average grade in the following format:
// "{name} -> {averageGrade}"
// Format the average grade to the 2nd decimal place.

public class Problem127 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int n = Integer.parseInt(input.nextLine());
            Map<String, List<Double>> studentInfo = new HashMap<>();
            for(int i = 0; i<n; i++) {
                List<Double> grades;
                String name = input.nextLine();
                Double grade = Double.valueOf(input.nextLine());
                if(grade < 2.0 || grade > 6.0) {
                    System.out.println("Invalid grade value!");
                    continue;
                }
                if (!studentInfo.containsKey(name)) {
                    grades = new ArrayList<>();
                } else {
                    grades = studentInfo.get(name);
                }
                grades.add(grade);
                studentInfo.put(name, grades);
            }

            for (Map.Entry<String, List<Double>> entry : studentInfo.entrySet()) {
                Double averageGrade = getAverage(entry.getValue());
                if (averageGrade >= 4.5) {
                    System.out.printf("%s -> %.2f\n", entry.getKey(), averageGrade);
                }                
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

    public static Double getAverage(List<Double> grades) {
        Double result = 0.0;
        for (Double grade : grades) {
            result += grade;
        }
            
        return result / grades.size();
    }
}
