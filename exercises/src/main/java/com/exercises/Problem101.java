package com.exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
// A core idea of several left-wing ideologies is that the wealthiest should support the poorest, no matter what, and that is exactly what you are called to do for this problem.
// On the first line, you will be given the population (numbers separated by comma and space ", "). On the second line, you will be given the minimum wealth. 
// You should distribute the wealth so that no part of the population has less than the minimum wealth. 
// There will be cases where the distribution will not be possible. In that case, print: "No equal distribution possible".

public class Problem101 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number sequence divided by ', ': ");
            String nums = input.nextLine();
            System.out.print("Enter a min number: ");
            int minWealth = input.nextInt();
            int[] amounts = java.util.Arrays.stream(nums.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
            int cache = 0;

            if (minWealth * amounts.length > java.util.Arrays.stream(amounts).sum()) {
                System.out.println("No equal distribution possible");
            } else {
                for (int i = 0; i < amounts.length; i++) {
                    if (amounts[i] < minWealth) {
                        cache += minWealth - amounts[i];
                        amounts[i] = minWealth;
                    }

                }

                for (int j = 0; j < amounts.length; j++) {
                    if (cache == 0) {
                        break;
                    }

                    System.out.println(amounts[j]);
                    if (amounts[j] > minWealth) {
                        System.out.println(amounts[j]);
                        if (amounts[j] - minWealth >= cache) {
                            amounts[j] -= cache;
                            System.out.println(amounts[j]);
                            break;
                        } else {
                            cache -= amounts[j] - minWealth;
                            amounts[j] = minWealth;
                        }
                        System.out.println(amounts[j]);
                    }

                }
                System.out.println(Arrays.toString(amounts));

            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}
