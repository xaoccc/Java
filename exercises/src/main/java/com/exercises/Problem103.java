package com.exercises;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;
// You are fed up with changing the version of your software manually. Instead, you will create a little script that will make it for you.
// You will be given a string representing the version of your software in the format: "{n1}.{n2}.{n3}". Your task is to print the next version. For example, if the current version is "1.3.4", the next version will be "1.3.5".
// The only rule is that the numbers cannot be greater than 9. If it happens, set the current number to 0 and increase the previous number. For more clarification, see the examples below.
// Note: there will be no case in which the first number will become greater than 9.
public class Problem103 {
    public static void main(String[] args) {
        System.out.print("Enter a version: ");
        try (Scanner input = new Scanner(System.in)) {
            int[] version = Arrays.stream(input.nextLine().trim().split("\\.")).mapToInt(Integer::parseInt).toArray();
            for (int i = version.length - 1; i >= 0; i--) {
                if (version[i] == 9) {
                    version[i] = 0;
                } else {
                    version[i] += 1;
                    break;
                }                 
            }
            String result = Arrays.stream(version).mapToObj(String::valueOf).collect(Collectors.joining("."));
            System.out.printf("New version: %s", result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
