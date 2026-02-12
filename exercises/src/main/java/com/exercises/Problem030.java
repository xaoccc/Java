package com.exercises;
import java.util.Scanner;
// Description:
// Ivan decides to break the World Record in long-distance swimming. 
// On the console is entered with the record in seconds that Ivan must break, the distance in meters that he must swim, 
// and the time in seconds it takes to swim 1 m. Write a program that calculates whether he has succeeded in the task, 
// given that: water resistance slows him down every 15 m by 12.5 seconds. When calculating how many times Ivan will slow 
// down as a result of water resistance, the result should be rounded down to the nearest whole number.
// Calculate the time in seconds that Ivan will take to swim the distance and the difference from the World Record.
// Input
// 3 lines are read from the console:
// 1. The record in seconds - a real number in the interval [0.00 … 100000.00]
// 2. The distance in meters - a real number in the interval [0.00 … 100000.00]
// 3. The time in seconds for swimming a distance of 1 m - a real number in the interval [0.00 … 1000.00]
// The output on the console depends on the result:
// • If Ivan has improved the World Record (his time is less than the record) we print:
// o "Yes, he succeeded! The new world record is {Ivan's time} seconds."
// • If he has NOT improved the record (his time is greater than or equal to the record) we print:
// o "No, he failed! He was {missing seconds} seconds slower."
// The result must be formatted to the second decimal place.
// Solution:
public class Problem030 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Record in seconds: ");
            double record = input.nextDouble();
            System.out.print("Distance in meters: ");
            double distance = input.nextDouble();
            System.out.print("Time in seconds for swimming a distance of 1 m: ");      
            double timeOneMeter = input.nextDouble();
            double slow = Math.floor(distance / 15) * 12.5;
            double totalTime = (distance * timeOneMeter) + slow;
            if (totalTime < record) {
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
            }
            else {
                System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
            }
        }
    }
}
