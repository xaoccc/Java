package com.exercises;
import java.util.Scanner;
// Write a program that reads an integer N entered by the user and generates all possible "special" numbers from 1111 to 9999. For a number to be "special", it must meet the following condition:
// • N is divisible by each of its digits without a remainder.
// Example: for N = 16, 2418 is a special number:
// • 16 / 2 = 8 without a remainder
// • 16 / 4 = 4 without a remainder
// • 16 / 1 = 16 without a remainder
// • 16 / 8 = 2 without a remainder
// The input is read from the console and consists of an integer in the interval [1…600000]
// Solution:
public class Problem098 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {
             int num = input.nextInt();
             for (int i = 1111; i < 10000; i++) {
                String iString = Integer.toString(i);
                boolean isSpecial = true;
                for (int j = 0; j< iString.length(); j++) {
                    if (iString.substring(j, j+1).equals("0")) {
                        isSpecial = false;
                        break;
                    }
                    if (num % Integer.parseInt(iString.substring(j, j+1)) != 0) {
                        isSpecial = false;
                        break;
                    }
                }
                if (isSpecial) {
                    System.out.printf("%s ", iString);
                }
             }
            
        }
    }
}
