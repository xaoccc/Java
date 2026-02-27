package com.exercises;
import java.util.Scanner;
// Description:
// Write a program in which Marin solves exam problems until he receives an "Enough" message from his lecturer. For each problem solved, he receives a grade. The program should stop reading data at the "Enough" command or if Marin receives the specified number of unsatisfactory grades.
// Any grade that is less than or equal to 4 is unsatisfactory.
// Solution:
public class Problem081 {
    public static void main(String[] args) {
        int badScoreCount = 0;
        int problemsCount = 0;
        double totalScore = 0;
        String lastProblem = "";
        try(Scanner input = new Scanner(System.in)) {
            int badScoreLimit = Integer.parseInt(input.nextLine());
            while (true) { 
                String taskName = input.nextLine();
                if (taskName.equals("Enough")) {
                    double averageScore = totalScore / problemsCount;
                    System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", averageScore, problemsCount, lastProblem);
                    break;
                }
                int score = Integer.parseInt(input.nextLine());
                totalScore += score;
                problemsCount++;
                lastProblem = taskName;
                if (score <= 4) {
                    badScoreCount++;
                    if (badScoreCount == badScoreLimit) {
                        System.out.printf("You need a break, %d poor grades.", badScoreLimit);
                        break;
                    }
                }
            }
        }
    }
}
