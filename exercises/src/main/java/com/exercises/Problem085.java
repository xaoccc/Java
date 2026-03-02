package com.exercises;
import java.util.Scanner;
// Write a program that counts the number of pieces of cake that guests have taken before it runs out. 
// You will get the dimensions of the cake in centimeters (width and length - integers in the interval [1...1000]) and then on each line, 
// until the command "STOP" is received or until the cake runs out, the number of pieces that guests take from it. The pieces are 1 cm square.
// Print one of the following lines to the console:
// • "{number of pieces} pieces are left." - if you get to STOP and there are pieces of cake left.
// • "No more cake left! You need {number of missing pieces} pieces more."
public class Problem085 {
    public static void main(String[] args) {         
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            int width = input.nextInt();
            int size = length * width;
            while (size >= 0) {
                String command = input.next();
                if (command.equals("STOP") && size >= 0) {
                    System.out.printf("%d pieces are left.", size);
                    return;
                } 
                size -= Integer.parseInt(command);              

            }
            System.out.printf("No more cake left! You need %d pieces more.", -size);           
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
