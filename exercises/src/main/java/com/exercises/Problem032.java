package com.exercises;
import java.util.Scanner;
// Description:
// During your lunch break, you want to watch an episode of your favorite TV series. 
// Your task is to write a program that will tell you whether you have enough time to watch the episode. 
// During your break, you will have time for lunch and time for relaxation. 
// Lunch time will be 1/8 of the break time, and relaxation time will be 1/4 of the break time.
// Input
// Read 3 lines from the console:
// 1. TV series name – text
// 2. Episode duration – integer in the range [10… 90]
// 3. Break duration – integer in the range [10… 120]
// Output
// Write one line to the console:
// • If you have enough time to watch the episode:
// "You have enough time to watch {TV series name} and left with {remaining time} minutes free time."
// • If you don't have enough time:
// "You don't have enough time to watch {TV series name}, you need {need time} more minutes."
// The time should be rounded up to the nearest whole number.
// Solution:
public class Problem032 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("TV series name: ");
            String seriesName = input.nextLine();
            System.out.print("Episode duration: ");
            int episodeDuration = input.nextInt();
            System.out.print("Break duration: ");           
            int breakDuration = input.nextInt();

            double lunchDuration = (double) breakDuration / 8;
            double relaxDuration = (double) breakDuration / 4;

            System.out.println(lunchDuration);
            System.out.println(relaxDuration);
            double timeNeeded = breakDuration - (relaxDuration + lunchDuration);


            if (timeNeeded >= episodeDuration) {
                System.out.printf("You have enough time to watch %s and left with %d minutes free time.", seriesName,  (int) Math.ceil(timeNeeded - episodeDuration));
            }
            else {
                System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", seriesName, (int) Math.ceil(episodeDuration - timeNeeded));
            }

        }
    }
}
