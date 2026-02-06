package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Calulate the time needed to complete the projects.
// Solution:
public class Problem007 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int HOURS_PER_PROJECT = 3;
            System.out.print("Architect name: ");
            String architectName = input.nextLine().trim();
            System.out.print("Number of projects: ");
            int projects = input.nextInt();
            if (projects < 0) {
                System.out.println("Projects number cannot be a negative number!");
                return;
            }
            System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, projects * HOURS_PER_PROJECT, projects);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }        
    }
}
