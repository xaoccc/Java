package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads a number n entered by the user and prints all numbers ≤ n in the sequence: 1, 3, 7, 15, 31, …. 
// Each subsequent number is calculated by multiplying the previous one by 2 and adding 1.
// Solution:
public class Problem075 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int nums = 1;
            while (nums <= n) {
                System.out.println(nums);
                nums = (nums * 2) + 1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ivnalid input!");
        }
    }
}
