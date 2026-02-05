package com.exercises;
// Description:
// Convert inches to centimeters.
// Solution:
import java.util.Scanner;
public class Problem004 {
    public static void main(String[] args) {
        System.out.print("Enter value in centimeters: ");
        Scanner input = new Scanner(System.in);
        float value = input.nextFloat();
        System.out.printf("%s centimeters are %f inches.", value, value * 2.54);
        input.close();
    }
}
// Notes: Validation is not possible without a while loop, which is too advanced at this point.
