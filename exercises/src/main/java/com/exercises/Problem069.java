package com.exercises;
import java.util.Scanner;
// Description:
// You have been invited by the Academy to write software that will calculate the points for an actor/actress. 
// The Academy will give you initial points for the actor. Then each evaluator will give his/her score. 
// The points that the actor receives are formed by: the length of the evaluator's name multiplied by the points that he/she gives divided by two.
// If the result at any point exceeds 1250.5 the program should interrupt and print that the given actor has received a nomination.
// Solution:
public class Problem069 {
    public static void main(String[] args) {
        double NOMINATION_POINTS = 1250.5;
        try (Scanner input = new Scanner(System.in)) {
            String actorName = input.nextLine();
            double points = Double.parseDouble(input.nextLine());
            int n = Integer.parseInt(input.nextLine());
            for (int i = 0; i < n; i++) {
                String evalName = input.nextLine();
                double evalPts = Double.parseDouble(input.nextLine());
                points += (evalName.length() * evalPts) / 2;
                if (points > NOMINATION_POINTS) {
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                    return;
                }
            }
            System.out.printf("Sorry, %s you need %.1f more!", actorName, NOMINATION_POINTS - points);
        }
    }
}
