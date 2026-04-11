package com.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem105 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> even = new ArrayList<>();
            ArrayList<String> odd = new ArrayList<>();
            ArrayList<String> positive = new ArrayList<>();
            ArrayList<String> negative = new ArrayList<>();

            // Convert a string of whole numbers into a list of integers
            int[] nums = Arrays.stream(input.nextLine().trim().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    even.add(String.valueOf(num));
                } else {
                    odd.add(String.valueOf(num));
                }

                if (num < 0) {
                    negative.add(String.valueOf(num));
                } else {
                    positive.add(String.valueOf(num));
                }
            }
            System.out.printf("Positive: %s\n", String.join(", ", positive));
            System.out.printf("Negative: %s\n", String.join(", ", negative));
            System.out.printf("Even: %s\n", String.join(", ", even));
            System.out.printf("Odd: %s\n", String.join(", ", odd));
        }
    }
}
