package com.exercises;
import java.util.Scanner;
// Description:
// Calculate the area of a rectangle.
// Solution:
public class Problem003 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.print("Enter height: ");
        Scanner scanner = new Scanner(System.in);        
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter width: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println(height * width);
        scanner.close();
    }
}

