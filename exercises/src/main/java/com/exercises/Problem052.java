package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A student has to go to an exam at a certain time. He comes to the exam hall at a given arrival time. 
// The student is considered to have arrived on time if he has arrived at the exam time or up to half an hour before. 
// If he has arrived more than 30 minutes earlier, he is early. If he has arrived after the exam time, he is late. 
// Write a program that reads the exam time and the arrival time and prints whether the student has arrived on time, 
// whether he has arrived early or late, and by how many hours or minutes he has arrived early or late.
// Solution:
public class Problem052 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int examHour = input.nextInt();
            int examMinute = input.nextInt();
            int arrivalHour = input.nextInt();
            int arrivalMinute = input.nextInt();
            int diff;

            if (examHour > 23 || examHour < 0
                    || arrivalHour > 23 || arrivalHour < 0
                    || examMinute > 59 || examMinute < 0
                    || arrivalMinute > 59 || arrivalMinute < 0) {
                System.out.println("Invalid input! Hours must be numbers between 0 and 23, minutes a number between 0 and 59.");
            }

            diff = (((examHour * 60) + examMinute) - ((arrivalHour * 60) + arrivalMinute));
            System.out.println(diff);
            if (diff > 30) {
                if (diff > 59) {
                    System.out.printf("Early\n%d:%02d hours before the start", (int) Math.floor(diff / 60), diff % 60);
                } else {
                    System.out.printf("Early\n%d minutes before the start", diff % 60);
                }
                
            } else if(diff >= 0 && diff <= 30) {
                if (diff == 0) {
                    System.out.printf("On time");
                } else
                System.out.printf("On time\n%d minutes before the start", diff % 60);
            } else {
                diff *= -1;
                if (diff > 59) {
                    System.out.printf("Late\n%d:%02d hours after the start", (int) Math.floor(diff / 60), diff % 60);
                } else {
                    System.out.printf("Late\n%d minutes after the start", diff % 60);
                }                
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
