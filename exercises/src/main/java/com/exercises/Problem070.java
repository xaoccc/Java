package com.exercises;
import java.util.Scanner;
// Climbers from all over Bulgaria gather in groups and identify the next peaks to climb. 
// Depending on the size of the group, the climbers will climb different peaks.
// • Group of up to 5 people – climb Musala
// • Group of 6 to 12 people – climb Mont Blanc
// • Group of 13 to 25 people – climb Kilimanjaro
// • Group of 26 to 40 people – climb K2
// • Group of 41 or more people – climb Everest
// Write a program that calculates the percentage of climbers climbing each peak.
public class Problem070 {
    public static int totalPeople;
    public static void main(String[] args) {        
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;
        int people;
        try(Scanner input = new Scanner(System.in)) {
            int groups = input.nextInt();
            
            for (int i = 0; i < groups; i++) {
                people = input.nextInt();                
                if (people < 1) {
                    continue;
                } else if (people < 6) {
                    group1 += people;
                } else if (people < 13) {
                    group2 += people;
                } else if (people < 26) {
                    group3 += people;
                } else if (people < 41) {
                    group4 += people;
                } else {
                    group5 += people;
                }
                totalPeople += people;
            }
            System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", calc(group1), calc(group2), calc(group3), calc(group4), calc(group5));
        }
    }
    public static double calc(int g){
        return ((double)g / (double) totalPeople) * 100;
    }

}
