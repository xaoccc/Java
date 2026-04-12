package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
// Write a program that receives a sequence of numbers (a string containing integers separated by ", ") and prints the numbers sorted into lists of 10's in the format "Group of {group}'s: {list_of_numbers}". 
// Examples: • The numbers 2, 8, 4, and 10 fall into the group of 10's. • The numbers 13, 19, 14, and 15 fall into the group of 20's. 

public class Problem108 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Create an array of integers from a string of numbers divided with ", "
            int[] nums = Arrays.stream(input.nextLine().trim().split(", ")).mapToInt(Integer::parseInt).toArray();
            int maxNum = Arrays.stream(nums).max().getAsInt();
            int groupsNum = (maxNum + 9) / 10;

            // We use arrays nested in an ArrayList to store the values
            @SuppressWarnings("unchecked")
            ArrayList<Integer>[] s = new ArrayList[groupsNum];

            for (int i = 0; i < groupsNum; i++) {
                s[i] = new ArrayList<>();
            }

            for (Integer num : nums) {
                // We warn about invalid values, BUT we do not terminate the program:
                if (num < 1 || num > 99) {
                    System.out.println("Number out of range!");
                } else {
                    if (num % 10 == 0) {
                        s[(num / 10) - 1].add(num);
                    } else {
                        s[num / 10].add(num);
                    }
                }
            }

            for (int j = 0; j < groupsNum; j++) {
                System.out.printf("Group of %d0's: %s\n", j + 1, s[j].toString());
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
