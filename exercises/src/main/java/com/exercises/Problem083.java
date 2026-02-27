package com.exercises;

import java.util.Scanner;

// Description:
// Gabby wants to start a healthy lifestyle and has set a goal to walk 10,000 steps every day. 
// However, some days she is very tired from work and wants to go home before she reaches her goal. 
// Write a program that reads from the console how many steps she walks each time she goes out during the day and 
// when she reaches her goal it should print "Goal reached! Good job!" and how many more steps she has walked "{difference between steps} steps over the goal!".
// If she wants to go home before then, she will type the command "Going home" and enter the steps she walked on the way home. 
// Then, if she fails to reach her goal, the console should print: "{difference between steps} more steps to reach goal."
// Solution:
public class Problem083 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalSteps = 0;
        int GOAL = 10000;

        while (true) {

            String command = input.nextLine();

            if (command.equals("Going home")) {
                int stepsToHome = Integer.parseInt(input.nextLine());
                totalSteps += stepsToHome;
                break;
            }

            totalSteps += Integer.parseInt(command);

            if (totalSteps >= GOAL) {
                break;
            }
        }

        if (totalSteps >= GOAL) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - GOAL);
        } else {
            System.out.printf("%d more steps to reach goal.", GOAL - totalSteps);
        }
    }
}