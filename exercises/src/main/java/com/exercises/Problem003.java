package com.exercises;
// Description:
// Print calculate the area of a rectangle.
// Solution:
import java.util.Scanner;
public class Problem003 {
    public static void main(String[] args) {
        System.out.print("Enter height: ");
        Scanner input1 = new Scanner(System.in);        
        String height = input1.nextLine();
        System.out.print("Enter width: ");
        Scanner input2 = new Scanner(System.in);
        String width = input2.nextLine();
        System.out.printf("The area is %d", Integer.parseInt(height) * Integer.parseInt(width));
    }
}
// Notes: Validation is not possible without a while loop, which is too advanced at this point.
