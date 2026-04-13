package com.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem111 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Convert a string of whole numbers into an ArrayList of integers (if you need to change the collection) (look Problem 105 for Array)
            ArrayList<Integer> nums = Arrays.stream(input.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
            int removedSum = 0;
            while (!nums.isEmpty()) {
                int index = Integer.parseInt(input.nextLine());
                int numToRemove;
                if (index < 0) {
                    numToRemove = nums.remove(0);
                    nums.add(0, nums.get(nums.size() - 1));
                } else if (index >= nums.size()) {
                    numToRemove = nums.remove(nums.size() - 1);
                    nums.add(nums.size(), nums.get(0));               
                } else {
                    numToRemove = nums.remove(index);   
                }
                removedSum += numToRemove;

                for (int i = 0; i < nums.size(); i++) {
                    if (nums.get(i) > numToRemove) {
                        nums.set(i, nums.get(i) - numToRemove);
                    } else {
                        nums.set(i, nums.get(i) + numToRemove);
                    }
                }

            }
            System.out.println(removedSum);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
