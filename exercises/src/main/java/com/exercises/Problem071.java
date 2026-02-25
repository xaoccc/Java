package com.exercises;
import java.util.Scanner;
// Grigor Dimitrov is a tennis player whose next goal is to climb the world rankings in men's tennis.
// During the year, Grisho participates in a certain number of tournaments, and for each tournament he receives points that depend on the position he finished in the tournament. There are three options for completing a tournament:
//  W - if he is the winner he receives 2000 points
//  F - if he is a finalist he receives 1200 points
//  SF - if he is a semi-finalist he receives 720 points
// Write a program that calculates how many points Grigor will have after playing all the tournaments, knowing how many points he started the season with. Also calculate how many points he wins on average from all the tournaments he played and what percentage of the tournaments he won.
public class Problem071 {
    public static void main(String[] args) {  
        String rank;
        int wins = 0; 
        int totalPoints = 0;     
        try(Scanner input = new Scanner(System.in)) {
            int tounaments = input.nextInt();
            int initialPoints = input.nextInt();
            totalPoints += initialPoints;
            for(int i = 0; i < tounaments; i++) {
                rank = input.next();
                switch (rank) {
                    case "W":
                        totalPoints += 2000;  
                        wins += 1;                      
                        break;
                    case "F":
                        totalPoints += 1200;                         
                        break;
                    case "SF":
                        totalPoints += 720;                        
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            System.out.printf("Final points: %d\nAverage points: %d\n%.2f%%", totalPoints, (totalPoints - initialPoints) / tounaments, ((double) wins / (double) tounaments) * 100);
        }
    }
}
