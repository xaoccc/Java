package com.exercises;
import java.util.Scanner;
import java.util.InputMismatchException;
// Description:
// Bob is a student. Write a program, which calculates how many hours a day he should spend reading the necessary literature.
// 3 lines are read from the console:
// 1. Number of pages in the current book - an integer in the range [1…1000]
// 2. Pages he reads in 1 hour - an integer in the range [1…1000]
// 3. Number of days he needs to read the book - an integer in the range [1…1000]
// Solution:
public class Problem012 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Pages: ");
            int pages = input.nextInt();
            System.out.print("Pages per hour: ");
            int pagesPerHour = input.nextInt();
            System.out.print("Days: ");
            int days = input.nextInt();

            if ((pages < 1 || pagesPerHour < 1 || days < 1) || (pages > 1000 || pagesPerHour > 1000 || days > 1000)) {
                System.out.println("Inputs must be integers in the range [1…1000]");
                return;
            }
            System.out.print(pages / pagesPerHour / days);
        } catch(InputMismatchException e) {
            System.out.print("Invalid input!");
        }
    }
}
