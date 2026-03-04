package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that calculates how many solutions in natural numbers (including zero) the equation has:
// x1 + x2 + x3 = n
// The number n is an integer and is entered from the console.
// Solution:
public class Problem090 {
    public static void main(String[] args) {
        int solutions = 0;
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i=0; i<n+1; i++) {            
                for (int j=0; j<n+1; j++) {                
                    for (int k=0; k<n+1; k++) {                    
                        if (i + j + k == n) {
                            solutions++;
                        }                   
                    }
                } 
            }
        }
        System.out.println(solutions);
    }
}
