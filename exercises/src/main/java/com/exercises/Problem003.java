package com.exercises;
// Description:
// Calculate the area of a rectangle.
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
        // Place for validation of both inputs.
        System.out.printf("The area is %f", Float.parseFloat(height) * Float.parseFloat(width));
        input1.close();
        input2.close();
    }
}
// Notes: 
// Validation is not possible without a while loop, which is too advanced at this point.
// Two Scanners in one block is a bad practice w/o try-with-recources. With try(Scanner..) {} 
// we can use nextFloat() instead nextLine() and we don't need to close the Scanner, because it closes automatically.
